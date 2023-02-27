import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class MitCommandTest {
    @Test
    void list_test() throws IOException {
        MitCommand.LIST.run("/Users/newp/study/codesquad-masters/course1_cs16/common-mit");
    }

    @Test
    void file_test () throws IOException {
        String d = "/Users/newp/study/codesquad-masters/course1_cs16/common-mit";
        File dir = new File(d);

        for (File file : dir.listFiles()) {
            System.out.println(file.getName() + " " + Files.size(file.toPath())/1024+"kb");
        }
    }
}