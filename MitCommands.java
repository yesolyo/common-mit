import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MitCommands {

    static void list(File file){
        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f.getName());
        }

    }

    public static void main(String[] args) throws IOException {
        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken() + " " + st.nextToken();
            String fileDir = st.nextToken();
            File file = new File(fileDir);


            switch (cmd){
                case "mit list": list(file); break;
                case "mit hash": hash(file); break;
                case "mit zlib": zlib(file); break;
            }
        }


    }

}
