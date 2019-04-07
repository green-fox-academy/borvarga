import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add an integer! ");
        int input = scanner.nextInt();
        System.out.println("Thanks, here is your illuminate sign: ");

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

