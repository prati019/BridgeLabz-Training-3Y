class Device {
    int deviceId;
    String status;
    Device(int id,String status){
        this.deviceId=id; this.status=status;
    }
    void displayStatus(){
        System.out.println("Device ID: "+deviceId+" Status: "+status);
    }
}

class Thermostat extends Device {
    double temperatureSetting;
    Thermostat(int id,String status,double temp){
        super(id,status);
        this.temperatureSetting=temp;
    }
    @Override void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature: "+temperatureSetting+"°C");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(101,"ON",24.5);
        t.displayStatus();
    }
}
