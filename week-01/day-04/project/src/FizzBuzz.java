public class FizzBuzz {
    public static void main(String[] args) {

        int numbOne = 0;

        while (numbOne < 100) {
            System.out.println(numbOne);
            numbOne++;

            if (numbOne % 3 == 0)
                System.out.print("Fizz");
            else
             if (numbOne % 5 == 0)
                System.out.println("Buzz");
        }
    }
}
