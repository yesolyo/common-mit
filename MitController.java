import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class MitController {
    Terminal terminal;
    boolean endFlag;

    public MitController() {
        this.terminal = new Terminal();
        this.endFlag = false;
    }

    public boolean isDone(String str) {
        if (str.toLowerCase().equals("exit")) {
            this.endFlag = true;
        }
        return this.endFlag;
    }
