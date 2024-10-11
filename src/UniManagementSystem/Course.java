package UniManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    private List<Professor> courseProfessors;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
        this.courseProfessors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has been enrolled in " + courseName);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
        System.out.println(student.getName() + " has been removed from " + courseName);
    }

    public void addProfessor(Professor professor) {
        courseProfessors.add(professor);
        System.out.println(professor.getName() + " is now teaching " + courseName);
    }

    public void removeProfessor(Professor professor) {
        courseProfessors.remove(professor);
        System.out.println(professor.getName() + " is no longer teaching " + courseName);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
        System.out.println("Professors Teaching:");
        for (Professor professor : courseProfessors) {
            System.out.println("- " + professor.getName());
        }
    }
}
