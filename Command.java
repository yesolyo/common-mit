import java.util.List;

public class Command {
    private final String command;
    private final Directory directory;

    public Command(String input, Directory directory) {
        this.command = input;
        this.directory = directory;
        isCommand();
    }

    private void isCommand() {
        List<String> commandList = List.of("zlib", "hash", "list");
        if (!commandList.contains(command)) {
            throw new IllegalArgumentException("다시 입력하세요");
        }
    }

    public void chooseCases() {
        switch (command) {
            case "list" -> caseOfList();
            case "hash" -> caseOfHash();
        }
    }

    private void caseOfList() {
        ListCommand.printFiles(directory.getDirectory());
    }

    private void caseOfHash() {
        HashCommand.printHashes(directory.getDirectory());
    }
}
