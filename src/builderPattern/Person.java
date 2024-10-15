package builderPattern;

public class Person {
    private String name;
    private int age;

    public static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            return person;
        }
    }
}
