package abstract_factory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractCarFactory factory1 = FactoryBuilder.getFactory("Merc");
        MercFactory mercFactory = (MercFactory)  factory1;
        Merc merc1 = (Merc) mercFactory.makeCar("Sport amg");
        merc1.printInfo();

        Merc merc2 = (Merc) factory1.makeCar("W240");
        merc2.printInfo();

        VolvoFactory volvoFactory = (VolvoFactory) FactoryBuilder.getFactory("Volvo");
        Volvo volvo = (Volvo) volvoFactory.makeCar("240");
        volvo.printInfo();
    }
}
