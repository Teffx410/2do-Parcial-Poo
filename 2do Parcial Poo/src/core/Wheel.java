
package core;


public abstract class Wheel {
private Provider provider;
    private double radius;

    public Wheel(Provider provider, double radius) {
        this.provider = provider;
        this.radius = radius;
    }

    public Provider getProvider() {
        return provider;
    }

    public double getRadius() {
        return radius;
    }
}
