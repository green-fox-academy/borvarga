package GreenFoxInheritance;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;


    @Override
    void getGoal() {
        super.getGoal();
        System.out.println("Be a junior software developer.");
    }

    @Override
    void introduction() {
        super.introduction();
        System.out.println("Hi, I'm name, a age year old gender from" + previousOrganization + " who skipped " + skippedDays + "days from the course already");
    }
}