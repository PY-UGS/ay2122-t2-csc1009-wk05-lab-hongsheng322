public class Ellipse extends Shape {
    double a, b;

    public Ellipse(double a, double b){
        this.a = a;
        this.b = b;
    }

    double area(){
        return PI * a * b;
    }
}
