public class SumDigitTwo {
    public static void main(String[] args) {
        System.out.println(sumDigits(1337));
    }
    public static int sumDigits(int n) {
        return n == 0 ? 0 : n % 10 + sumDigits(n / 10);
    }
}
