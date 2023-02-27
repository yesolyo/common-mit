import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashInstruction {

    public void printHash(File dir) throws NoSuchAlgorithmException, IOException {
        File[] files = dir.listFiles();
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        for (File file : files) {
            if (file.getName().endsWith(".z")) continue;
            extractFileHash(md, file);
        }
    }

    private void extractFileHash(MessageDigest md, File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);

        byte[] dataBytes = new byte[1024];

        int nread = 0;
        while ((nread = fis.read(dataBytes)) != -1) {
            md.update(dataBytes, 0, nread);
        }
        byte[] hash = md.digest();

        StringBuilder hexHash = new StringBuilder();
        for (byte b : hash) {
            String hexString = String.format("%02x", b);
            hexHash.append(hexString);
        }

        System.out.println(file.getName() + " = " + hexHash);
    }
}
