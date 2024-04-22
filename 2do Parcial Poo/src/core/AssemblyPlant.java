
package core;

import java.util.ArrayList;


public class AssemblyPlant {
    private int MaxCars;
    private ArrayList<Car> cars;

    public AssemblyPlant(int MaxCars) {
        this.MaxCars = MaxCars;
        cars = new ArrayList<>();
    }
    
    public void addCar(Car car){
        this.cars.add(car);
    }
}
