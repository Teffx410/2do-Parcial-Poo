
package core;


public abstract class Wheel {
    private double radius;
    private String material;

    public Wheel(double radius, String material) {
        this.radius = radius;
        this.material = material;
    }

    public double getRadius(){
        return this.radius;
    }
    
}
