package UniManagementSystem;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "123 Main St", "S12345", "Computer Science");
        student1.enrollCourse("Data Structures");

        Student student2 = new Student("Bob", 21, "234 Oak St", "S54321", "Mathematics");

        Professor professor = new Professor("Dr. Smith", 45, "456 Elm St", "P67890", "Computer Science", 75000);
        professor.addCourseTaught("Data Structures");

        Staff staff = new Staff("John Doe", 35, "789 Oak St", "ST1122", "Administrator", 50000);

        Course dataStructuresCourse = new Course("Data Structures");
        dataStructuresCourse.addStudent(student1);
        dataStructuresCourse.addStudent(student2);
        dataStructuresCourse.addProfessor(professor);

        dataStructuresCourse.displayCourseInfo();

        Payable[] payables = {professor, staff};
        for (Payable payable : payables) {
            System.out.println("Salary: $" + payable.calculateSalary());
        }

        Person[] people = {student1, professor, staff};
        for (Person person : people) {
            person.displayInfo();
            System.out.println();
        }
    }
}
