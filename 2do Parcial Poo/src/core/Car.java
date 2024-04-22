
package core;


public class Car {
  private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }
}

