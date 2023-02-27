import java.io.File;

public class Mit {
    public void list(String directory) {
        try {
            File dir = new File(directory);
            for (File file : dir.listFiles()) {
                System.out.printf("%s %dKB\n", file.getName(), file.length() / 1024);
            }
        } catch (NullPointerException e) {
            System.out.println("입력 경로가 잘못되었습니다");
        }
    }

    public void hash(String directory) {

    }

    public void zip(String directory) {

    }
}
