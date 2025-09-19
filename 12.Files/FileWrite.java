
import java.io.File;
import java.io.FileWriter;

public class FileWrite{
    public static void main(String[] args) {
        try {
            File f = new File("example.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("This line was writed by File code");
            fw.close();

        }
        catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
}
