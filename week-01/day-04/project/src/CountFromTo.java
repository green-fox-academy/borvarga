import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Add a number!");

        Scanner scanner = new Scanner(System.in);

        int numbOne = scanner.nextInt();

        System.out.println("Add a second number!");

        int numbTwo = scanner.nextInt();

        if (numbTwo < numbOne)
            System.out.println("Second number should be greater!");



        else if (numbTwo < numbOne)
            System.out.println(numbTwo);
        numbTwo++;

    }
}
