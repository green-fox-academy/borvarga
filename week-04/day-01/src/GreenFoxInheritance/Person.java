package GreenFoxInheritance;

public class Person {
    String name = "Jane Doe";
    String gender = "female";
    int age = 30;

    Person () {
    }

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