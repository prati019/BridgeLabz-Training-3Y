interface Worker {
    void performDuties();
}

class PersonBase {
    String name;
    int id;
    PersonBase(String name,int id){
        this.name=name; this.id=id;
    }
}

class Chef extends PersonBase implements Worker {
    Chef(String name,int id){ super(name,id); }
    public void performDuties(){ System.out.println(name+" cooks delicious meals."); }
}

class Waiter extends PersonBase implements Worker {
    Waiter(String name,int id){ super(name,id); }
    public void performDuties(){ System.out.println(name+" serves customers."); }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker w1 = new Chef("Gordon",1);
        Worker w2 = new Waiter("John",2);
        w1.performDuties();
        w2.performDuties();
    }
}
