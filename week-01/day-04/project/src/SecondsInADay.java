public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsInADay = 86400;

        int passedSeconds = currentSeconds + (currentMinutes * 60) + (currentHours * 60 * 60);

        System.out.println(secondsInADay - passedSeconds);


    }
}
