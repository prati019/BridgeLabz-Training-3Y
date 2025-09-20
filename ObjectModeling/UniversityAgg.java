import java.util.*;

class Faculty {
    String name;
    Faculty(String name){ this.name = name; }
    void display(){ System.out.println("Faculty: " + name); }
}

class DepartmentU {
    String name;
    DepartmentU(String name){ this.name = name; }
    void display(){ System.out.println("Department: " + name); }
}

class University {
    String name;
    List<DepartmentU> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name){ this.name = name; }
    void addDepartment(DepartmentU d){ departments.add(d); }
    void addFaculty(Faculty f){ faculties.add(f); }
    void display(){
        System.out.println("University: " + name);
        for(DepartmentU d : departments) d.display();
        for(Faculty f : faculties) f.display();
    }
}

public class UniversityAgg {
    public static void main(String[] args) {
        University u = new University("Global University");
        u.addDepartment(new DepartmentU("Computer Science"));
        Faculty f1 = new Faculty("Dr. Smith");
        u.addFaculty(f1);
        u.display();
    }
}
