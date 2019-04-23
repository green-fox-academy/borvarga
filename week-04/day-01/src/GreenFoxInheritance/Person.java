package GreenFoxInheritance;

public class Person {
    String name;
    String gender;
    int age;

    Person (String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    void introduction(){
        System.out.println("My name is " + name + "and I am a(n) " + age + " " + gender);
    }
    void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
