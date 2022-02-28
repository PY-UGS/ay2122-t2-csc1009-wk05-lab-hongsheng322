public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getDiameter()
    {
        return 2* radius;
    }

    public void PrintCircle()
    {
        
    }
}
