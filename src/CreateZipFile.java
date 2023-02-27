import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipFile {
    final static String folder = "/Users/park/Desktop/common-mit/zip/";

    public static void createZipFile(String directory) throws FileNotFoundException {
        File dir = new File( directory);
        File files[] = dir.listFiles();

        File zipFile = new File(folder, "압축파일.z");
        byte[] buf = new byte[4096];

        try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile))) {

            for (File file : files) {
                if(file.isDirectory()) continue;
                try (FileInputStream in = new FileInputStream(file)) {
                    ZipEntry ze = new ZipEntry(file.getName());
                    out.putNextEntry(ze);

                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }

                    out.closeEntry();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("압축 파일 생성 성공");

    }
}