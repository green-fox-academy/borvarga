package GreenFoxInheritance;

public class Sponsor extends Person{
    String company;
    int hiredStudents;

    Sponsor(){
    }

    Sponsor(String name, int age, String gender, String company){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.company = company;
    }


    @Override
    void introduction() {
        super.introduction();
        System.out.println("Hi, I'm " + name + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");

    }

    int hire(int a){
        return hiredStudents + a;
    }

    @Override
    void getGoal() {
        super.getGoal();
        System.out.println("Hire brilliant junior software developers.");
    }
}
