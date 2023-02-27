import java.io.File;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;

public class Application {
    public static void main(String[] args) throws NoSuchAlgorithmException, FileNotFoundException {
        while (true) {
            String command = Input.getInput();
            if (command.substring(0, 8).equals("mit list")) {
                File dir = new File(command.substring(9));
                File files[] = dir.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isFile())
                        System.out.println("file : " + files[i] + " " + files[i].length() + "byte");
                }
            } else if (command.substring(0, 8).equals("mit hash")) {
                File dir = new File(command.substring(9));
                File files[] = dir.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isFile())
                        System.out.println("hash : " + SHA256.encrypt(String.valueOf(files[i])));
                }
            } else if (command.substring(0, 8).equals("mit zlib")) {
                String dir = command.substring(9);
                CreateZipFile.createZipFile(dir);
                System.out.println("압축 완료 " + new File("/Users/park/Desktop/common-mit/zip/압축파일.z").length());
            }
            else break;
        }

    }
}
