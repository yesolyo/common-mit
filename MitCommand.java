import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Optional;

public enum MitCommand {
    LIST("list"){
        @Override
        void run(String directory) throws IOException {
            // 디렉토리에서 전체 파일 목록을 탐색하고, 파일 크기와 파일명을 출력한다
            File dir = new File(directory);
            char idx = 'a';

            for (File file : dir.listFiles()) {
                if (file.isHidden()) continue;  // 숨김 파일은 출력 생략
                System.out.printf("%s. %s %dkb\n",idx++, file.getName(), file.length()/1024);
            }
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

    MitCommand(String command) {
        this.command = command;
    }

    public static Optional<MitCommand> of (String str) {
        return Arrays.stream(values()).filter(e -> e.command.equals(str)).findFirst();
    }

    abstract void run(String directory) throws IOException;
}
