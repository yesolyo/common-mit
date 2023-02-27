package domain;

import java.util.List;
import java.util.Map;

public class Command {

	private final CommandType command;
	private final String directoryPath;

	public Command(String input) {
		validate(input);

		String[] tokens = input.split(" ");
		this.command = CommandType.of(tokens[1]);
		this.directoryPath = tokens[2];
	}

	private void validate(String input) {
		String[] tokens = input.split(" ");
		if (tokens.length != 3 || !tokens[0].equals("mit")) {
			throw new IllegalArgumentException("[ERROR] 명령 형식은 [mit 명령어 디렉토리명] 입니다.");
		}
		if (!tokens[1].equals("list") && !tokens[1].equals("hash") && !tokens[1].equals("zlib")) {
			throw new IllegalArgumentException("[ERROR] 명령어는 [list, hash, zlib] 중 하나여야 합니다.");
		}
	}

	public CommandType getCommand() {
		return command;
	}

	public List<Map<String, Object>> doTask() {
		return command.doTask(directoryPath);
	}
}
