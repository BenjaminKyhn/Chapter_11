import java.util.ArrayList;
import java.util.Date;

public class Exercise_11_6 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Date());
        list.add(new Circle());
        list.add(new Loan());
        list.add(new String("String class"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
