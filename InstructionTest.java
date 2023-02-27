import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

class InstructionTest {

    @Test
    void listTest() {
        ListInstruction listIns = new ListInstruction();
        File dir = new File("./Work/Masters");
        listIns.printAll(dir);
    }

    @Test
    void hashTest() throws NoSuchAlgorithmException, IOException {
        HashInstruction hashIns = new HashInstruction();
        File dir = new File("./Work/Masters");
        hashIns.printHash(dir);
    }

    @Test
    void zipTest() throws IOException {
        ZlibInstruction zlibIns = new ZlibInstruction();
        File dir = new File("./Work/Masters");
        zlibIns.zip(dir);
    }
}