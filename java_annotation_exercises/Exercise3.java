import java.util.ArrayList;

public class Exercise3 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // raw type
        list.add("Hello");
        list.add(123);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}