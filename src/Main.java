import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List_Instruction li = new List_Instruction();
        Hash_Instruction hi = new Hash_Instruction();
        zip_Instruction zi = new zip_Instruction();

        while (true) {
            System.out.print("\n$ ");
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");

            if (inputArr[0].equals("mit")) {
                String path = System.getProperty("user.dir") + "/common-mit" + inputArr[2].substring(1);
                File dir = new File(path);

                switch (inputArr[1]) {
                    case "list" -> li.print_List(dir);
                    case "hash" -> hi.print_Hash(dir);
                    case "zlib" -> zi.zip_File(dir);
                    default -> throw new IllegalArgumentException("[에러] 명령어가 없습니다.");
                }
            } else {
                throw new IllegalArgumentException("[에러] mit 명령어가 아닙니다.");
            }
        }
    }
}