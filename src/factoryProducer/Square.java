package factoryProducer;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Вызван метод Square::draw()");
    }
}
