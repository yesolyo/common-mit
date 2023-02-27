import java.util.List;

public interface MitCommand {
    List<String> list(String directoryName);
    List<String> hash(String directoryName);
    List<String> zlib(String directoryName);
}
