public class Triangle extends Shape {
    double length;
    double height;

    public Triangle(double length, double height)
    {
        this.length = length;
        this.height = height;
    }

    double area(){
        return (length * height) /2;
    }
}