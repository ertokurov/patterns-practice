package shapeFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Вызван метод Rectangle::draw");
    }
}
