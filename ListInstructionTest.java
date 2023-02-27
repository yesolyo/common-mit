import org.junit.jupiter.api.Test;

import java.io.File;

class ListInstructionTest {

    @Test
    void printAll() {
        ListInstruction listIns = new ListInstruction();
        File dir = new File("./Work/Masters");
        listIns.printAll(dir);
    }
}