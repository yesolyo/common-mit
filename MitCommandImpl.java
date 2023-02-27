import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MitCommandImpl implements MitCommand{

    @Override
    public List<File> list(String directoryName) {
        File folder = new File(directoryName);
        List<File> result = new ArrayList<>();

        if(!folder.isDirectory()){
            System.out.printf("입력하신 디렉토리명은 디렉토리가 아닙니다. : %s%n", directoryName);
            return null;
        }

        for(String fileName : folder.list()){
            result.add(new File(fileName));
        }
        return result;
    }

    @Override
    public List<String> hash(String directoryName) {
        return null;
    }

    @Override
    public List<String> zlib(String directoryName) {
        return null;
    }
}
