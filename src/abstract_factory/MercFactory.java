package abstract_factory;

public class MercFactory extends AbstractCarFactory{
    @Override
    CarInterface makeCar(String model) {
        if(model == null) return null;

        boolean amgVersion = false;
        if(model.toLowerCase().indexOf("amg") >= 0) amgVersion = true;

        return new Merc(model, amgVersion);
    }
}
