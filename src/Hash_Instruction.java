import java.io.File;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Hash_Instruction {
    public void print_Hash(File dir) {
        File[] files = dir.listFiles();
        Arrays.sort(Objects.requireNonNull(files));

        Stream.of(files).forEach(f -> {
            MessageDigest md;
            try {
                md = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                System.err.println("sha256 부분 에러" + e.getMessage());
                throw new RuntimeException(e);
            }

            // 암호화
            md.update(f.getName().getBytes(StandardCharsets.UTF_8));
            String hex = String.format("%064x", new BigInteger(1, md.digest()));
            System.out.println(f.getName() + " = " + hex);
        });
    }
}
