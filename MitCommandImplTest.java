import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.Optional;

class MitCommandImplTest {
    @Test
    @DisplayName("mit list 명령어를 수행하여 디렉토리안에 파일들을 가져오는지 테스트")
    public void list_givenDirectoryName_whenMitList_thenGetFileList(){
        //given
        MitCommand mit = new MitCommandImpl();
        //when
        Optional<List<File>> optionalList = mit.list("./Work/Masters");
        //then
        optionalList.ifPresentOrElse(list->{
            list.stream()
                    .map(file->String.format("%s %.2fKB", file.getName(), (double) file.length() / 1024))
                    .forEach(System.out::println);
        }, ()->Assertions.fail("테스트에 실패하였습니다."));
    }
}