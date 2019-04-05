public class CodingHours {
    public static void main(String[] args) {
        int dailyHours = 6;
        int totalWeeks = 17;
        int workDays = 5;

        System.out.println((workDays * dailyHours) * totalWeeks);

        float weeklyWorkHours = 52;

        float percentage = (float)((workDays * dailyHours * totalWeeks) / (totalWeeks * weeklyWorkHours) * 100);

        System.out.println(percentage);
    }
}
