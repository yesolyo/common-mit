public class Mit {
    private final String mit;

    public Mit(String input) {
        this.mit = input;
        isMit();
    }

    private void isMit() {
        if (!mit.equals("mit")) {
            throw new IllegalArgumentException("mit 입력하세요.");
        }
    }
}
