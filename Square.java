public class Square extends Shape {
    double length;

    public Square(double length)
    {
        this.length = length;
    }

    double area(){
        return length * length;
    }
}
