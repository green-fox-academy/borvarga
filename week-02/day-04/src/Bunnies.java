public class Bunnies {
    public static void main(String[] args) {
        System.out.println(earCounter(4));

    }
    public static int earCounter (int bunnieNumber) {
        if (bunnieNumber == 0) {
            return 0;
        }else {
            return 2 + earCounter(bunnieNumber-1);
        }
    }
}
