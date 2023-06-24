package abstract_factory;

public class Merc implements CarInterface {
    private String name;
    private boolean amgVersion;

    public Merc(String name, boolean amgVersion) {
        this.name = name;
        this.amgVersion = amgVersion;
    }

    @Override
    public void drive() {
        System.out.println("Merc driving");
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Merc{" +
                "name='" + name + '\'' +
                ", amgVersion=" + amgVersion +
                '}';
    }
}
