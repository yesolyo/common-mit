import java.io.File;
import java.util.List;
import java.util.Optional;

public interface MitCommand {
    Optional<List<File>> list(String directoryName);
    Optional<List<String>> hash(String directoryName);
    Optional<List<String>> zlib(String directoryName);
}
