import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public class HashCommand {
    public static void printHashes(File directory) {
        File[] files = directory.listFiles();
        assert files != null;
        for (File file : files) {
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                byte[] buffer = new byte[1024];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                int bytesRead;
                while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                    messageDigest.update(buffer, 0, bytesRead);
                }
                byte[] digest = messageDigest.digest();
                StringBuilder hexString = new StringBuilder();
                for (byte b : digest) {
                    hexString.append(String.format("%02x", b));
                }
                System.out.println(file.getName() + " = " + hexString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
