package factoryPattern;

public class CarFactory {

    public Car getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("SEDAN")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("COUPE")) {
            return new Coupe();
        } else if (carType.equalsIgnoreCase("SUV")) {
            return new SUV();
        }
        return null;
    }
}
