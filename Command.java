public class Command {
    private final String command;

    public Command(String input) {
        this.command = input;
    }

    public boolean isList() {
        if (command.equals("list")) {
            return true;
        }
        throw new IllegalArgumentException("mit 입력하세요.");
    }

    public boolean isHash() {
        if (command.equals("hash")) {
            return true;
        }
        throw new IllegalArgumentException("mit 입력하세요.");
    }

    public boolean isZlib() {
        if (command.equals("zlib")) {
            return true;
        }
        throw new IllegalArgumentException("mit 입력하세요.");
    }
}
