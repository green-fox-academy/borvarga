import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theNumber = 69;
        System.out.println("Guess my number!");
        int guess = scanner.nextInt();
        if (guess < theNumber) {
            System.out.println("The stored number is higher. ");
        } else if (guess > theNumber) {
            System.out.println("The stored number is lower.");
        }
    }
}