package factory;

interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

class VehicleFactory {
    public Vehicle getVehicle(String type) {
        switch (type.toUpperCase()) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "TRUCK":
                return new Truck();
        }
        return null;
    }
}
public class FactoryExample {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Car car1 = (Car) factory.getVehicle("Car");
        System.out.println(car1.getType());

        Car car2 = (Car) factory.getVehicle("Car");
        System.out.println(car2.getType());

        Truck truck = (Truck) factory.getVehicle("Truck");
        System.out.println(truck.getType());
    }
}
