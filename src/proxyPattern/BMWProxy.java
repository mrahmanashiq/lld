package proxyPattern;

public class BMWProxy extends BMW{
    @Override
    public void makeSound() {
        System.out.println("Vroom Vroom - BMWProxy");
        super.makeSound();
    }
}
