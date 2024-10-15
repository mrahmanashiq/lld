package builderPattern;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder()
            .setName("John")
            .setAge(30)
            .build();

        System.out.println("person = " + person1);
    }
}
