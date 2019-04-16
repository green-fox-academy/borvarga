import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number to divide 10 with it: ");
        int divisor = scanner.nextInt();

        try {
            int number = 10 / divisor;
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
