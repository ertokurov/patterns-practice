package factoryProducer;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Вызван метод RoundedSquare::draw()");
    }
}
