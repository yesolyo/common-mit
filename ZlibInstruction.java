import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZlibInstruction {

    public void zip(File dir) throws IOException {
        File[] files = dir.listFiles();

        for (File file : files) {
            File zipFile = new File(dir.getPath(), file.getName() + ".z");

            byte[] buf = new byte[4096];

            try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile))) {
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
        }
    }
}
