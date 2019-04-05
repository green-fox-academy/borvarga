import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        System.out.println("Add a number: ");

        Scanner scanner = new Scanner(System.in);

        int userInput1 = scanner.nextInt();

        if (userInput1 % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");


    }
}
