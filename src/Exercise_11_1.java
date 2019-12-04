import java.util.Scanner;

public class Exercise_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("Enter a colour for the triangle: ");
        String colour = input.next();
        triangle.setColour(colour);

        System.out.println("Enter a boolean for filled: ");
        boolean filled = input.nextBoolean();
        triangle.setFilled(filled);

        System.out.println("The area of the triangle is " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
        System.out.println("The colour of the triangle is " + triangle.getColour());
        System.out.println("The triangle is " + (triangle.isFilled() ? "filled" : "not filled"));
    }
}
