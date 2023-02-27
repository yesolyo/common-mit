import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {
    private BufferedReader br;
    private final String TAG = "mit";
    private final String EXIT = "exit";

    public Terminal() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String[] readUserInput() throws IOException{
        String[] strings = br.readLine().split(" ");

        if (!strings[0].toLowerCase().equals(TAG) && !strings[0].toLowerCase().equals(EXIT)) {
            System.out.println("[EXCEPTION] 유효하지 않는 명령입니다.");
            return readUserInput();
        }

        return strings;
    }
}
