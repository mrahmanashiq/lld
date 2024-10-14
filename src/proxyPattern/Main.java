package proxyPattern;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMWProxy();
        bmw.makeSound();
    }
}
