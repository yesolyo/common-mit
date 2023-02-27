import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public Command commandInput() {
        try {
            System.out.println("명령어를 입력해주세요");
            String input = scanner.nextLine();
            return parseInput(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return commandInput();
        }
    }

    private Command parseInput(String input) {
        String[] split = input.split(" ");
        if (split.length != 3) throw new IllegalArgumentException("잘못된 명령 형식입니다");
        if (!split[0].equals("mit")) throw new IllegalArgumentException("mit 명령어가 아닙니다");
        return new Command(split[1], split[2]);
    }
}
