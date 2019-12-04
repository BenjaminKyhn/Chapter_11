public class Listing_11_4 {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The colour is " + circle.getColour());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("Thea area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
