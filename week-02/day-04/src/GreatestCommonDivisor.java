import java.math.BigInteger;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(greatest(20,15));
    }
    private static int greatest(int a, int b) {
        if (b == 0)
            return a;
        return greatest(b,a%b);
    }
}
