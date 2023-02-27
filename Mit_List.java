import java.io.File;

public class Mit_List {

    public void readFile(String dirName) {
        File dir = new File(dirName);

        File[] fileList = dir.listFiles();

        for(File temp : fileList) {
            String title = temp.getName();

            System.out.println(title + " " +temp.length()/1024 + "KB" );
        }

    }
}
