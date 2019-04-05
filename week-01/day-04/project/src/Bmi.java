public class Bmi {
    public static void main(String[] args) {
        double massInKG = 81.2;
        double heightInM = 1.78;
        double heightInCm = heightInM * 100;

        System.out.println("Your bmi is: " + massInKG / heightInCm / heightInCm * 10000);
    }
}
