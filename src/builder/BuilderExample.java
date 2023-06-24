package builder;
class Car {
    private String manufacturer;
    private String name;
    private int topSpeed;
    private String color;

    private Car (CarBuilder carBuilder) {
        this.manufacturer = carBuilder.manufacturer;
        this.name = carBuilder.name;
        this.topSpeed = carBuilder.topSpeed;
        this.color = carBuilder.color;
    }
    public static class CarBuilder {
        private String manufacturer;
        private String name;
        private int topSpeed;
        private String color;

        public CarBuilder(String manufacturer, String name) {
            this.manufacturer = manufacturer;
            this.name = name;
        }


        public CarBuilder withTopSpeed (int topSpeed) {
            this.topSpeed = topSpeed;
            return this;
        }

        public CarBuilder withColor (String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car (this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}
public class BuilderExample {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Ford", "Mustang")
                .withColor("red").withTopSpeed(220).build();
        System.out.println(car);
    }
}
