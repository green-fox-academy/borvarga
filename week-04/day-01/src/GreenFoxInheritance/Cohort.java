package GreenFoxInheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String nameCohort;
    ArrayList<Person> people = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    Cohort (String nameCohort){
        this.nameCohort = nameCohort;
    }

    void addStudent(Student student){
        students.add(student);
    }

    void addMentor(Mentor mentor){
        mentors.add(mentor);
    }
    void info(){
        System.out.println("The " + nameCohort + "cohort has " + students.size() + "students and " + mentors.size() + "." );
    }

    public void main(String[] args) {

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);
    }
}
