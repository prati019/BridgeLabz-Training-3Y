public class Employee {
    private String name;
    private final int id;   // unique id
    private String designation;

    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    // Constructor with this
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    public void display() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", ID: " + id +
                    ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 201, "Manager");
        Employee e2 = new Employee("Bob", 202, "Developer");

        e1.display();
        e2.display();
        Employee.displayTotalEmployees();
    }
}
