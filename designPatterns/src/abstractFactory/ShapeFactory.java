package abstractFactory;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
