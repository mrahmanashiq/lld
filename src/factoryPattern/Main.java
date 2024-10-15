package factoryPattern;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car sedan = carFactory.getCar("SEDAN");
        sedan.drive();

        Car coupe = carFactory.getCar("COUPE");
        coupe.drive();

        Car suv = carFactory.getCar("SUV");
        suv.drive();
    }

    /*
     * The Factory Method pattern involves a factory class with an abstract method or interface for creating objects.
     * This pattern delegates the responsibility of object creation to subclasses, providing flexibility in determining
     * which object to instantiate.
     *
     * In the Spring Framework, the ApplicationContext leverages the Factory Method pattern to create and manage beans.
     * It uses the BeanFactory interface and its implementations to instantiate, configure, and assemble objects (beans),
     * promoting loose coupling and flexibility in object creation.
     *
     * The client code does not need to know the exact class of the bean being instantiated. Instead, Spring manages the
     * object creation, allowing the configuration of beans through XML, Java configuration, or annotations.
     *
     * Key Points:
     * - **Encapsulates object creation logic**: Object creation is abstracted and handled by a factory class.
     * - **Promotes loose coupling**: By avoiding direct instantiation of objects, it reduces dependencies between classes.
     * - **Flexibility**: The pattern allows the creation of different types of objects based on the context or input.
     *
     * Example Use Cases: Object creation in frameworks like Spring (for beans), logging libraries (to create loggers),
     * and UI toolkits (to create different widgets).
     */

}
