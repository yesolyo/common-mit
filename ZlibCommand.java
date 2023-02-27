import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class ZlibCommand {
    public static void printZlib(File directory) {
        File[] files = directory.listFiles();
        assert files != null;
        for (File file : files) {
            try {
                FileInputStream in = new FileInputStream(file);
                FileOutputStream out = new FileOutputStream(file.getPath() + ".z");

                Deflater compressor = new Deflater();
                byte[] buffer = new byte[1024];

                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(out, compressor);

                int length;
                while ((length = in.read(buffer)) > 0) {
                    deflaterOutputStream.write(buffer, 0, length);
                }

                in.close();
                deflaterOutputStream.finish();
                deflaterOutputStream.close();

                File zFile = new File(file.getPath() + ".z");

                System.out.println( zFile.getName() + " " + zFile.length() + "byte");

            } catch (IOException e) {
                System.out.println("[ERROR] 압축 에러");
            }
        }
    }
}
