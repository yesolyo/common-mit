import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class MitCommandImplTest {
    @Test
    public void list_givenDirectoryName_whenMitList_thenGetFileList(){
        //given
        MitCommand mit = new MitCommandImpl();
        //when
        List<File> list = mit.list("./Work/Masters");
        //then
        list.stream()
            .map(file->String.format("%s %.2fKB", file.getName(), (double) file.length() / 1024))
            .forEach(System.out::println);
    }
}