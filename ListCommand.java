import java.io.File;

public class ListCommand {
    public static void printFiles(File directory) {
        File[] files = directory.listFiles();
        assert files != null;
        for (File file : files) {
            System.out.println(file.getName() + " " + file.length() + "byte" + " (" + file.length() / 1024 + "KB)");
        }
    }
}