import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zip_Instruction {
    public void zip_File(File dir) {
        File[] files = dir.listFiles();
        Arrays.sort(Objects.requireNonNull(files));

        Stream.of(files).filter(f -> !f.getName().contains(".z")).forEach(f -> {
            File zipFile = new File(dir.getPath(), f.getName() + ".z");
            byte[] buf = new byte[1024];

            try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile))) {
                try (FileInputStream in = new FileInputStream(f)) {
                    ZipEntry ze = new ZipEntry(f.getName());
                    out.putNextEntry(ze);

                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    out.closeEntry();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        print_Zip(dir);
    }

    public void print_Zip(File dir) {
        File[] files = dir.listFiles();
        Arrays.sort(Objects.requireNonNull(files));

        Byte_Cal byteCal = new Byte_Cal();
        Stream.of(files).filter(f -> f.getName().contains(".z")).forEach(f -> {
            System.out.println(f.getName() + " " + byteCal.byteCalculation(String.valueOf(f.length())));
        });
    }
}
