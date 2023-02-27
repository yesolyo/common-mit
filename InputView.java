import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getInput() throws IOException {
        return reader.readLine();
    }

    public void stop() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
