import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Application {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        Console console = new Console();

        while (true) {
            console.input();
        }
    }
}
