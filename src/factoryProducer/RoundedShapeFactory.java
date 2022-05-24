package factoryProducer;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == "rectangle")
            return new RoundedRectangle();
        else if (shapeType == "square")
            return new RoundedSquare();
        return null;
    }
}
