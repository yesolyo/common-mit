import java.io.File;

public class Mit {
    public void list(String path) {
        File directory = new File(path);
        File[] files = directory.listFiles();

        if (files == null) {
            System.out.println("해당 경로에 파일이 존재하지 않습니다.");
            return;
        }

        for (File file : files) {
            String filename = file.getName();
            long fileSize = file.length() / 1024; // kilobyte
            System.out.println(filename + " " + fileSize + "KB");
        }
    }
}
