package shapeFactory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == "circle")
            return new Circle();
        else if (shapeType == "rectangle")
            return new Rectangle();
        else if (shapeType == "square")
            return new Square();
        return null;
    }

}
