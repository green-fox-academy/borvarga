import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j, k, number;

        System.out.println("Add the size of the pyramid's basement!");
        number = scanner.nextInt();

        for (i = 0; i < number; i++) {
            for (j = 0; j < number; j++) {
                System.out.print("  ");
            }
                for (k = 0; k <= i; k++) {
                    System.out.print("*");
                }


            System.out.println();
        }
    }
}
