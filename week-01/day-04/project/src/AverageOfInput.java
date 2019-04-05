import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the first number: ");

        int numberOne = scanner.nextInt();

        System.out.println("Add the second number:");

        int numberTwo = scanner.nextInt();

        System.out.println("Add the third number:");

        int numberThree = scanner.nextInt();

        System.out.println("Add the fourth number:");

        int numberFour = scanner.nextInt();

        System.out.println("Add the fifth number:");

        int numberMumboNoFive = scanner.nextInt();

        System.out.println("Sum: " +  (numberOne + numberTwo + numberThree + numberFour + numberMumboNoFive) + " " +
                "Average: " + (numberOne + numberTwo + numberThree + numberFour + numberMumboNoFive) / 5.);
    }
}
