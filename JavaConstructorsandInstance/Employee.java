public class Employee {
    // Access modifiers
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary (for demo)
    public double getSalary() {
        return salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass
class Manager extends Employee {
    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to demonstrate access to employeeID and department
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department); // protected
        System.out.println("Salary: $" + getSalary());
    }
}

// Main class for demo
class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp = new Employee(1001, "IT", 60000.0);
        emp.displayDetails();

        emp.setSalary(65000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());

        Manager mgr = new Manager(1002, "HR", 70000.0);
        mgr.displayManagerDetails();
    }
}
