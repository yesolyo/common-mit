import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] commands; // 0, 1, 2
        commands = br.readLine().split(" ");
        Mit mit = new Mit(commands[0]);
        // commands[1]부터는 맘대로
        br.close();
    }
}
