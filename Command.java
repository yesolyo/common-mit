import java.util.List;

public class Command {
    private final String command;

    public Command(String input) {
        this.command = input;
        isCommand();
    }

    private void isCommand() {
        List<String> commandList = List.of("zlib", "hash", "list");
        if (!commandList.contains(command)) {
            throw new IllegalArgumentException("다시 입력하세요");
        }
    }
}
