import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Enter an integer to use multiplication table:");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int a = 1; a <= 15; a++)
            System.out.println(number + "*" + a + " = " + (number * a));





    }
}
