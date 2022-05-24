package erboltokurov;

import shapeFactory.*;

public class Main {
    public static void main(String[] args) {
	    //   ----- Фабричный метод -----
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape_1 = shapeFactory.getShape("circle");
        shape_1.draw();

        Shape shape_2 = shapeFactory.getShape("rectangle");
        shape_2.draw();

        Shape shape_3 = shapeFactory.getShape("square");
        shape_3.draw();

    }
}
