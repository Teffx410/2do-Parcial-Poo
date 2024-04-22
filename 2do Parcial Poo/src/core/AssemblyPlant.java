
package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AssemblyPlant {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void providerSummary() {
        Map<Provider, Integer> providerCount = new HashMap<>();

        for (Car car : cars) {
            Provider provider = car.getWheel().getProvider();
            providerCount.put(provider, providerCount.getOrDefault(provider, 0) + 1);
        }

        System.out.println("Providers Summary:\n");
        for (Map.Entry<Provider, Integer> entry : providerCount.entrySet()) {
            System.out.println("- Cars using " + entry.getKey().getName() + " = " + entry.getValue());
        }

        System.out.println("\nCar details:");
        for (Car car : cars) {
            System.out.println("- Car uses " + car.getWheel().getProvider().getName() + " Provider");
        }
    }

    public Car getCarBiggestWheel() {
        Car carWithBiggestWheel = null;
        double maxRadius = Double.MIN_VALUE;

        for (Car car : cars) {
            double radius = car.getWheel().getRadius();
            if (radius > maxRadius) {
                maxRadius = radius;
                carWithBiggestWheel = car;
            }
        }

        return carWithBiggestWheel;
    }
}
