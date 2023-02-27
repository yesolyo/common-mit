import java.io.File;

public class Directory {
    protected File directory;

    public Directory() {
    }

    public Directory(File directory) {
        this.directory = directory;
    }

    public Directory(String input) {
        this.directory = new File(input);

        if (!directory.exists() || !directory.isDirectory()) {
            throw new IllegalArgumentException("올바른 경로가 아닙니다.");
        }
    }
}
