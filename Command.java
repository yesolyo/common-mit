public class Command {
    private final String command;

    public Command(String input) {
        this.command = input;
    }

    public boolean isList() {
        return command.equals("list");
    }

    public boolean isHash() {
        return command.equals("hash");
    }

    public boolean isZlib() {
        return command.equals("zlib");
    }
}
