import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class List_Instruction {
    public void print_List(File dir) {
        File[] files = dir.listFiles();
        Arrays.sort(Objects.requireNonNull(files));

        Byte_Cal byteCal = new Byte_Cal();
        Stream.of(files).forEach(f -> {
            System.out.println(f.getName() + " " + byteCal.byteCalculation(String.valueOf(f.length())));
        });
    }
}
