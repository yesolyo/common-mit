import java.io.File;
import java.util.stream.Stream;

public class ListInstruction {

    public void printAll(File dir) {
        File[] files = dir.listFiles();

        Stream.of(files).forEach(f -> {
            System.out.println(f.getName() + " " + f.length() + "KB");
        });
    }
}
