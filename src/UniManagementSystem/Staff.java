package UniManagementSystem;

public class Staff extends Person implements Payable {
    private String staffId;
    private String role;
    private double salary;

    public Staff(String name, int age, String address, String staffId, String role, double salary) {
        super(name, age, address);
        this.staffId = staffId;
        this.role = role;
        this.salary = salary;
    }

    public void performDuty() {
        System.out.println(getName() + " is performing their duty as " + role);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Staff ID: " + staffId + ", Role: " + role);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
