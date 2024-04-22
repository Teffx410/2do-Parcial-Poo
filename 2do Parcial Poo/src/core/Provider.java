package core;

public abstract class Provider {
  private String name;

    public Provider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Provider() {
    }
    
}
