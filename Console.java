import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Console {

    private final Scanner sc = new Scanner(System.in);
    private final ListInstruction listIns = new ListInstruction();
    private final HashInstruction hashIns = new HashInstruction();
    private final ZlibInstruction zipIns = new ZlibInstruction();

    public void input() throws IOException, NoSuchAlgorithmException {
        System.out.print("\n$ ");
        String input = sc.nextLine();

        if (!input.split(" ")[0].equals("mit")) {
            throw new IllegalArgumentException("[ERROR] mit 명령어가 아닙니다.");
        }

        String ins = input.split(" ")[1];
        String directoryPath = input.split(" ")[2];
        File dir = new File(directoryPath);

        if (ins.equals("list")) {
            listIns.printAll(dir);
        } else if (ins.equals("hash")) {
            hashIns.printHash(dir);
        } else if (ins.equals("zlib")) {
            zipIns.zip(dir);
        } else {
            throw new IllegalArgumentException("[ERROR] 입력 오류");
        }
    }
}
