package erboltokurov;

import factoryProducer.*;

public class MainAbstract {
    public static void main(String[] args) {
        //    ----- Абстрактная фабрика -----
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape_1 = shapeFactory.getShape("rectangle");
        shape_1.draw();

        Shape shape_2 = shapeFactory.getShape("square");
        shape_2.draw();

        shapeFactory = FactoryProducer.getFactory(true);

        Shape shape_3 = shapeFactory.getShape("rectangle");
        shape_3.draw();

        Shape shape_4 = shapeFactory.getShape("square");
        shape_4.draw();
    }
}
