public class Student {
    // Access modifiers
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display details (for demo)
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to demonstrate access to protected member
    public void displayPostgradDetails() {
        System.out.println("Postgrad Student:");
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name); // protected, accessible in subclass
        // CGPA is private, not accessible directly, use getter
        System.out.println("CGPA: " + getCGPA());
    }
}

// Main class for demo
class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s = new Student(101, "Alice", 8.5);
        s.displayDetails();

        // Modify CGPA using public method
        s.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(102, "Bob", 8.7);
        pg.displayPostgradDetails();
    }
}
