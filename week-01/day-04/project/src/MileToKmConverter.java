import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Add amount of km(s) for converting:");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();

        System.out.println("That is equal to " + userInput1 * 1.609 + " miles");


    }
}
