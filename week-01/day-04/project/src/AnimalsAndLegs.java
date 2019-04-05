import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {


        System.out.println("How many chickens do you own? ");

        Scanner scanner = new Scanner(System.in);

        int numbChickens = scanner.nextInt();

        System.out.println("How many cows do you own? ");

        int numbCows = scanner.nextInt();

        System.out.println("Your animals (probably) have " + ((numbChickens * 2) + (numbCows * 4)) + " legs. :) ");
    }
}
