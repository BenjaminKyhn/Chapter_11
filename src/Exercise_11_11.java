import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_11 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        // Fill the array with 5 double values
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 doubles: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        // Print the sum
        sort(list);
        System.out.println(list);
    }

    // Method for calculating sum of double values
    public static void sort(ArrayList<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            double min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }

            if (minIndex != i){
                list.set(minIndex,list.get(i));
                list.set(i, min);
            }
        }
    }
}
