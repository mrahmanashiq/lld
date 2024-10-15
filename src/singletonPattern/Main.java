package singletonPattern;

public class Main {
    public static void main(String[] args) {
//        Cache cache = new Cache(); // Error: Cache() has private access in Cache
        Cache cache = Cache.getInstance();
        cache.putKeyValue("name", "John Doe");
        System.out.println(cache.getValue("name"));
    }

    /*
     * The Singleton pattern is a design pattern that ensures a class has only one instance and provides a global point of access to it.
     * It is useful when you need to control object creation, limiting the number of instances to just one.
     * This pattern is often used when you need exactly one object to coordinate actions across the system, such as a configuration
     * manager, logging system, or database connection.
     *
     * Key Points:
     * - Only one instance of the class is created.
     * - Provides a global point of access to that instance (usually via a static method).
     * - Commonly used in resource management, logging systems, or configuration classes.
     * - Can improve efficiency by controlling resource-heavy objects and ensuring they are not recreated multiple times.
     *
     * Example Use Cases: Configuration managers, database connections, thread pools, logging utilities, etc.
     */

}
