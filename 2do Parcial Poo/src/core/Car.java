package core;

public class Car {


    private Provider provider;
    private Wheel wheel;
    private Engine engine;

    public Car(String provider, double radius, String material, double weight, double cost) {
        if (provider == "Renault") {
            this.wheel = new RenaultWheel(radius, material);
            this.engine = new RenaultEngine(weight, cost);
            this.provider = new Renault();
        } else {
            this.wheel = new HyundaiWheel(radius, material);
            this.engine = new HyundaiEngine(weight, cost);
            this.provider = new Hyundai();
        }     
               
    }
    public Wheel getWheel(){
           return this.wheel;
       }


}

