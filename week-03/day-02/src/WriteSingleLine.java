import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path src = Paths.get("assets/my-file.txt");
        String myName = scanner.nextLine();
        try {
            List<String> list = Files.readAllLines(src);
            Files.write(Paths.get("assets/my-file.txt"), myName.getBytes());
        }catch (Exception e){
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}