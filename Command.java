public class Command {
    private final String command;

    public Command(String input) {
        this.command = input;
        isList();
        isHash();
        isZlib();
    }

    private void isList() {
        if (!command.equals("list")) {
            throw new IllegalArgumentException("mit 입력하세요.");
        }
    }

    private void isHash() {
        if (!command.equals("hash")) {
            throw new IllegalArgumentException("mit 입력하세요.");
        }
    }

    private void isZlib() {
        if (!command.equals("zlib")) {
            throw new IllegalArgumentException("mit 입력하세요.");
        }
    }
}
