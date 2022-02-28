public class RectangleGeometricObject extends GeometricObject{
    private double width;
    private double height;

    public RectangleGeometricObject(){
        width = 0;
        height = 0;
    }

    public RectangleGeometricObject(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public RectangleGeometricObject(double width, double height, String color, boolean filled)
    {
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }
}
