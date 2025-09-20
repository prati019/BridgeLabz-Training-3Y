public class Patient {
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // unique

    private static String hospitalName = "Apollo Hospital";
    private static int totalPatients = 0;

    // Constructor with this
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Hospital: " + hospitalName + ", Total Patients: " + totalPatients);
    }

    public void display() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID + ", Name: " + name +
                    ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Amit", 35, "Fever", 401);
        Patient p2 = new Patient("Sneha", 28, "Cold", 402);

        p1.display();
        p2.display();
        Patient.getTotalPatients();
    }
}
