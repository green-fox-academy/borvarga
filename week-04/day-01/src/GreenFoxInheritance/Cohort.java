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
}
