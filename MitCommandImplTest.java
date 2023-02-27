import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class MitCommandImplTest {
    @Test
    public void list_givenDirectoryName_whenMitList_thenGetFileList(){
        //given
        MitCommand mit = new MitCommandImpl();
        //when
        List<String> list = mit.list("./Work/Masters");
        //then
        list.forEach(System.out::println);
    }
}