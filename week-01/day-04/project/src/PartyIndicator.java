import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many girls are coming to the party? ");

        int numbGirls = scanner.nextInt();

        System.out.println("And how many boooois? ");

        int numbBoys = scanner.nextInt();

        if (numbBoys + numbGirls >= 20)
            System.out.println("The party is excellent!");
        else if ((numbBoys + numbGirls) >= 20 && (numbBoys != numbGirls))
            System.out.println("Quite cool party");
        else if (numbBoys + numbGirls <= 20)
            System.out.println("Average party...");
        else if (numbGirls <= 1)
            System.out.println("Sausage party");
        else;


    }
}
