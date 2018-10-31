package patterns.abstractfactory;

public class RedTriangleFactory extends GraphicFactory {
    @Override
    public Shape getShape() {
        return new Triangle();
    }

    @Override
    public Color getColor() {
        return new Red();
    }
}
