import java.util.Arrays;
import java.util.Optional;

public enum MitCommand {
    LIST("list"){
        @Override
        void run(String directory) {
            System.out.println("list가 실행됩니다.");
        }
    },
    HASH("hash"){
        @Override
        void run(String directory) {
            System.out.println("hash가 실행됩니다.");
        }
    },
    ZLIB("zlib"){
        @Override
        void run(String directory) {
            System.out.println("zlib이 실행됩니다.");
        }
    };

    private String command;
    private String reg = String.format("mit %s /[.]+", command);

    MitCommand(String command) {
        this.command = command;
    }

    public static Optional<MitCommand> of (String str) {
        return Arrays.stream(values()).filter(e -> e.command.equals(str)).findFirst();
    }

    abstract void run(String directory);
}
