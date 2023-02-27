public class Mit {
    private final String mit;

    public Mit(String input) {
        this.mit = input;
    }

    public boolean isMit() {
        if (mit.equals("mit")) {
            return true;
        }

        throw new IllegalArgumentException("mit 입력하세요.");
    }
}
