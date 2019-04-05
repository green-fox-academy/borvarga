import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theNumber = 69;
        int guess ;
        boolean win = false;
        while (win == false) {
            System.out.println("Guess my number! ");
            guess = scanner.nextInt();
            if (guess == theNumber) {
                win = true;
            } else if (guess < theNumber) {
                System.out.println("The stored number is higher.");
            } else if (guess > theNumber) {
                System.out.println("The stored number is lower.");
            }
        }
        System.out.println("You guessed the number: " + theNumber);

    }
}