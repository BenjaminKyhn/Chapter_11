import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to be added to the array list: ");

        // Loop that adds integers to the array list
        Integer number = input.nextInt();
        while (number != 0){
            list.add(number);
            number = input.nextInt();
        }

        // Print the max result
        System.out.println(max(list));
    }

    // Method for finding the max integer
    public static Integer max(ArrayList<Integer> list){
        Integer max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
}
