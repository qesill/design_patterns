package abstract_factory;

public class FactoryBuilder {
    public static AbstractCarFactory getFactory(String name) {
        if (name == null) return null;

        if(name.equalsIgnoreCase("Merc")) {
            return new MercFactory();
        } else if (name.equalsIgnoreCase("Volvo")) {
            return new VolvoFactory();
        }

        return null;
    }
}
