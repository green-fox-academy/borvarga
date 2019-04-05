import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Enter a number PLEASE :");

        number = scanner.nextInt();

        switch(number) {
            case 0:
                System.out.println("Not Enough");
                break;
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("A lot");
                break;


        }
    }
}
