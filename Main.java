import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Mit_List mit_list = new Mit_List();
        // "/Users/shindeokyong/Desktop/Work/Masters"

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("경로 입력 : ");
            String command = scanner.nextLine();
            if(command.split(" ")[1].equals("list")) {
                mit_list.readFile(command.split(" ")[2]);
            }
        }
    }

}
