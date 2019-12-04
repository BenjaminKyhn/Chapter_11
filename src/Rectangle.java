import org.w3c.dom.css.Rect;

public class Rectangle extends GeometricObject {
    private double height;
    private double width;

    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String colour, boolean filled){
        this.width = width;
        this.height = height;
        setColour(colour);
        setFilled(filled);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Return area
    public double getArea(){
        return width * height;
    }

    // Return perimeter
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
