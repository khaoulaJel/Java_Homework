package UniManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person implements Payable {
    private String professorId;
    private String department;
    private List<String> coursesTaught;
    private double salary;

    public Professor(String name, int age, String address, String professorId, String department, double salary) {
        super(name, age, address);
        this.professorId = professorId;
        this.department = department;
        this.coursesTaught = new ArrayList<>();
        this.salary = salary;
    }

    public void assignGrade(Student student, String course, String grade) {
        System.out.println(getName() + " assigned grade " + grade + " to " + student.getName() + " for " + course);
    }

    public void conductLecture(String course) {
        System.out.println(getName() + " is conducting a lecture on " + course);
    }

    public void addCourseTaught(String course) {
        coursesTaught.add(course);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Professor ID: " + professorId + ", Department: " + department);
        System.out.println("Courses Taught: " + coursesTaught);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
