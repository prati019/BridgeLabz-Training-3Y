class Person {
    String name;
    int age;
    Person(String name,int age){ this.name=name; this.age=age; }
}

class Teacher extends Person {
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age); this.subject=subject;
    }
    void displayRole(){ System.out.println(name+" teaches "+subject); }
}

class Student extends Person {
    int grade;
    Student(String name,int age,int grade){
        super(name,age); this.grade=grade;
    }
    void displayRole(){ System.out.println(name+" is a student of grade "+grade); }
}

class Staff extends Person {
    String department;
    Staff(String name,int age,String department){
        super(name,age); this.department=department;
    }
    void displayRole(){ System.out.println(name+" works in "+department+" department"); }
}

public class SchoolSystem {
    public static void main(String[] args) {
        new Teacher("Mrs. Smith",40,"Math").displayRole();
        new Student("Alice",15,10).displayRole();
        new Staff("Bob",35,"Admin").displayRole();
    }
}
