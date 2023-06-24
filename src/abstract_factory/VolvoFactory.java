package abstract_factory;

public class VolvoFactory extends AbstractCarFactory{
    @Override
    CarInterface makeCar(String model) {
        if(model == null) return null;
        return new Volvo(model);
    }
}
