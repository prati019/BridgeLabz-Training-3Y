import java.util.*;

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();
    Doctor(String name){ this.name = name; }
    void consult(Patient p){
        patients.add(p);
        p.doctors.add(this);
        System.out.println("Doctor " + name + " is consulting Patient " + p.name);
    }
}

class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    Patient(String name){ this.name = name; }
}

class Hospital {
    String name;
    Hospital(String name){ this.name = name; }
}

public class HospitalAssociation {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Alice");
        Doctor d2 = new Doctor("Dr. Bob");
        Patient p1 = new Patient("John");
        d1.consult(p1);
        d2.consult(p1);
    }
}
