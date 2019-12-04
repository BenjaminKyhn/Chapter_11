import java.util.ArrayList;

public class Exercise_11_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Fill the arraylist with integers
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Shuffle the array
        shuffle(list);

        // Print the array
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    // Method for shuffing the arraylist
    public static void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);
    }
}
