import java.io.IOException;

public class Application {
    private final InputView inputView = new InputView();
    private final Mit mit = new Mit();

    public void run() throws IOException {
        while (true) {
            String input = inputView.getInput();
            String[] inputs = input.split(" ");
            String command = inputs[1];
            String path = inputs[2];
            switch (command) {
                case "list":
                    mit.list(path);
                case "hash":
                case "zlib":
                case "exit":
                    inputView.stop();
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Application application = new Application();
        application.run();
    }
}
