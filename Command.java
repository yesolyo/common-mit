import java.util.List;

public class Command extends Directory {
    private final String command;

    public Command(String input) {
        super();
        this.command = input;
        isCommand();
    }

    private void isCommand() {
        List<String> commandList = List.of("zlib", "hash", "list");
        if (!commandList.contains(command)) {
            throw new IllegalArgumentException("다시 입력하세요");
        }
    }

    public void caseOfList() {
        ListCommand.printFiles(directory);
    }
}
