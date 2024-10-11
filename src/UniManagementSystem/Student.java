package UniManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private String major;
    private List<String> enrolledCourses;

    public Student(String name, int age, String address, String studentId, String major) {
        super(name, age, address);
        this.studentId = studentId;
        this.major = major;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        enrolledCourses.add(course);
        System.out.println(getName() + " enrolled in " + course);
    }

    public void dropCourse(String course) {
        enrolledCourses.remove(course);
        System.out.println(getName() + " dropped " + course);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Major: " + major);
        System.out.println("Enrolled Courses: " + enrolledCourses);
    }
}
