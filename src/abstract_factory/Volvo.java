package abstract_factory;

public class Volvo implements CarInterface{
    private String name;

    public Volvo(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Volvo moving");
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "name='" + name + '\'' +
                '}';
    }
}
