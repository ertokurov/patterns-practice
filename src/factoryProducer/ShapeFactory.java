package factoryProducer;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == "rectangle")
            return new Rectangle();
        else if (shapeType == "square")
            return new Square();
        return null;
    }
}
