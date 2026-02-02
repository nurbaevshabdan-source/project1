//ArraysList; Class_Practise 1
import java.util.ArrayList;


public class ArCl1 {
    public static void main(String[] args) {
        ArrayList<String> books1 = new ArrayList<>();
        ArrayList<String> books2 = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        books1.add("book1");
        books1.add("book2");
        books1.add("book3");

        books2.add("book3");
        books2.add("book4");
        books2.add("book5");

        for (String book : books1) {
            if (!result.contains(book)) {
                result.add(book);
            }
        }

        for (String book : books2) {
            if (!result.contains(book)) {
                result.add(book);
            }
        }

        System.out.println(result);
    }
}