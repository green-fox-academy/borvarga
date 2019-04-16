import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class CountLines {
    public static void main(String[] args) {
        try {
            Path newPath = Paths.get("assets/testfile.txt");
            List<String> list = Files.readAllLines(newPath);
            System.out.println(list.size());
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}
