
package core;


public abstract class Engine {

 private Provider provider;
    private double weight;
    private double cost;

    public Engine(Provider provider, double weight, double cost) {
        this.provider = provider;
        this.weight = weight;
        this.cost = cost;
    }

    public Provider getProvider() {
        return provider;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    private double weight;
    private double cost;

    public Engine(double weight, double cost) {
        this.weight = weight;
        this.cost = cost;
    }
    

}
