public class Bunnies2 {
    public static void main(String[] args) {
        System.out.println(earCounter(7));
    }
    public static int earCounter (int bunnieNumber) {
        if (bunnieNumber == 0) {
            return 0;
        } else {
            return 3 + earCounter(bunnieNumber - 1);
        }
    }
}
