import java.util.*;

class Employee {
    String name;
    Employee(String name){ this.name = name; }
    void display(){ System.out.println("   Employee: " + name); }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();
    Department(String name){ this.name = name; }
    void addEmployee(Employee e){ employees.add(e); }
    void display(){
        System.out.println(" Department: " + name);
        for(Employee e : employees) e.display();
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();
    Company(String name){ this.name = name; }
    void addDepartment(Department d){ departments.add(d); }
    void display(){
        System.out.println("Company: " + name);
        for(Department d : departments) d.display();
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));
        comp.addDepartment(dev);
        comp.display();
    }
}
