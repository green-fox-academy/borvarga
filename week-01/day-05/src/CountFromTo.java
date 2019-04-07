import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a number: ");
        int numbOne = scanner.nextInt();
        System.out.println("Please add a second number: ");
        int numbTwo = scanner.nextInt();

        if (numbTwo <= numbOne) {
            System.out.println("The second number should be bigger! ");
            numbTwo = scanner.nextInt();
        }

        while (numbOne < numbTwo) {
            System.out.println(numbOne);
            numbOne++;
        }
    }
}
