package factoryProducer;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Вызван метод RoundedRectangle::draw()");
    }
}
