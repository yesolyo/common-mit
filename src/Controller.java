public class Controller {
    private final Input input;
    private final Mit mit;

    public Controller(Input input, Mit mit) {
        this.input = input;
        this.mit = mit;
    }

    public void run() {
        while (true) {
            Command command = input.commandInput();
            String directory = command.directory;
            switch (command.type) {
                case LIST -> mit.list(directory);
                case HASH -> mit.hash(directory);
                case ZLIB -> mit.zip(directory);
            }
        }
    }
}
