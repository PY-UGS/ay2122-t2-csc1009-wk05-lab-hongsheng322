public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    double area(){
        return width * height;
    }
}
