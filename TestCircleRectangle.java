public class TestCircleRectangle {
    public static void main(String[] args){
        CircleGeometricObject circleGeometricObject = new CircleGeometricObject(1);
        System.out.println("A circle " + circleGeometricObject.toString());
        System.out.println("The color is " + circleGeometricObject.getColor());
        System.out.println("The radius is " + circleGeometricObject.getRadius());
        System.out.println("The area is " + circleGeometricObject.getArea());
        System.out.println("The diameter is " + circleGeometricObject.getDiameter());

        RectangleGeometricObject rectangleGeometricObject = new RectangleGeometricObject(2,4);
        System.out.println("A rectangle " + rectangleGeometricObject.toString());
        System.out.println("The area is " + rectangleGeometricObject.getArea());
        System.out.println("The perimeter is " + rectangleGeometricObject.getPerimeter());

        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Circle circle = new Circle(5);
        Ellipse ellipse = new Ellipse(7, 7);
        Square square = new Square(6);
        Shape figref;

        figref = rectangle;
        System.out.println("Area is " + figref.area());
        figref = triangle;
        System.out.println("Area is " + figref.area());
        figref = circle;
        System.out.println("Area is " + figref.area());
        figref = ellipse;
        System.out.println("Area is " + figref.area());
        figref = square;
        System.out.println("Area is " + figref.area());
    }
}
