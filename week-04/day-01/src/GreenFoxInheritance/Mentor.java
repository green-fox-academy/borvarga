package GreenFoxInheritance;

public class Mentor extends Person {
    String level;

    Mentor () {
    }

    Mentor (String name, String gender, int age, String level){
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.level = level;
    }

    @Override
    void getGoal() {
        super.getGoal();
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    void introduction() {
        super.introduction();
        System.out.println("Hi, I'm " + name + "a " + age + "year old " + gender + " " + level + " mentor.");
    }
}
