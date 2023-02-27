public class Command {
    public final CommandType type;
    public final String directory;

    public Command(String type, String directory) {
        this.type = CommandType.of(type);
        this.directory = directory;
    }
}

enum CommandType {
    LIST, HASH, ZLIB;

    public static CommandType of(String str) {
        try {
            return CommandType.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("지원하지 않는 mit 명령어입니다");
        }
    }
}
