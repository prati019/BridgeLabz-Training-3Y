public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in hours
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 40, 299.99);
        Course c2 = new Course("Data Structures", 30, 199.99);

        System.out.println("Before updating institute:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        System.out.println("\nAfter updating institute:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
