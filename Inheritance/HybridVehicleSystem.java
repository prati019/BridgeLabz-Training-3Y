interface Refuelable {
    void refuel();
}

class VehicleBase {
    int maxSpeed;
    String model;
    VehicleBase(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
}

class ElectricVehicle extends VehicleBase {
    ElectricVehicle(int speed,String model){
        super(speed,model);
    }
    void charge(){
        System.out.println(model+" is charging.");
    }
}

class PetrolVehicle extends VehicleBase implements Refuelable {
    PetrolVehicle(int speed,String model){
        super(speed,model);
    }
    public void refuel(){
        System.out.println(model+" is refueling.");
    }
}

public class HybridVehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150,"Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180,"Honda Civic");
        ev.charge();
        pv.refuel();
    }
}
