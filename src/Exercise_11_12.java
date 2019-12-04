import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        // Fill the array with 5 double values
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 doubles: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        // Print the sum
        System.out.println(sum(list));
    }

    // Method for calculating sum of double values
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
