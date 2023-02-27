import java.io.File;

public class Directory {
    private final File directory;

    public Directory(String input) {
        this.directory = new File(input);

        if (!directory.exists() || !directory.isDirectory()) {
            throw new IllegalArgumentException("올바른 경로가 아닙니다.");
        }
    }

    public void printFiles() {
        File[] files = directory.listFiles();
        assert files != null;
        for (File file : files) {
            System.out.println("파일 이름: " + file.getName()
                    +
                    ", "
                    + "파일 크기: " + file.length() + "bytes");
        }
    }
}
