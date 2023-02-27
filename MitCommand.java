import java.io.File;
import java.util.List;

public interface MitCommand {
    List<File> list(String directoryName);
    List<String> hash(String directoryName);
    List<String> zlib(String directoryName);
}
