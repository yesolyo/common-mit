import java.io.File;

public class ListCommand {
    public static void printFiles(File directory) {
        File[] files = directory.listFiles();
        assert files != null;
        for (File file : files) {
            System.out.println("파일 이름: " + file.getName()
                    + ", "
                    + "파일 크기: " + file.length() + "bytes");
        }
    }
}
