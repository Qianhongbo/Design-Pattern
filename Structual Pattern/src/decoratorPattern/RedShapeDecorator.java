package decoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(this.decoratedShape);
    }

    // add a new function(decorate)
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

}
