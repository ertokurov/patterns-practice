package shapeFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Вызван метод Circle::draw");
    }
}
