interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + " | Name: " + name + " | Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private String record;

    public InPatient(int id, String name, int age, double roomCharge) {
        super(id, name, age);
        this.roomCharge = roomCharge;
    }

    public double calculateBill() { return roomCharge + 2000; }
    public void addRecord(String rec) { record = rec; }
    public void viewRecords() { System.out.println("Record: " + record); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String record;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    public double calculateBill() { return consultationFee; }
    public void addRecord(String rec) { record = rec; }
    public void viewRecords() { System.out.println("Record: " + record); }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient(1, "Alice", 30, 5000),
                new OutPatient(2, "Bob", 25, 1000)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).addRecord("General Checkup");
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println(" ");
        }
    }
}
