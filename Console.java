import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs; // 0, 1, 2
        inputs = br.readLine().split(" ");

        Mit mit = new Mit(inputs[0]);
        Directory directory = new Directory(inputs[2]);
        Command command = new Command(inputs[1], directory);

        command.caseOfList();
        br.close();
    }
}
