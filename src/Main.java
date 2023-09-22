public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        ShapeUtils.printShapeName(shape);
        shape = new Circle();
        ShapeUtils.printShapeName(shape);
        shape = new Oval();
        ShapeUtils.printShapeName(shape);
        shape = new Square();
        ShapeUtils.printShapeName(shape);
        shape = new Trapezium();
        ShapeUtils.printShapeName(shape);

        System.out.println("\n");

        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Oval oval = new Oval();
        Square square = new Square();
        Trapezium trapezium = new Trapezium();
        ShapeUtils.printShapeName(triangle);
        ShapeUtils.printShapeName(circle);
        ShapeUtils.printShapeName(oval);
        ShapeUtils.printShapeName(square);
        ShapeUtils.printShapeName(trapezium);
    }
}