//ArraysList; Class_Practise 5
import java.util.ArrayList;

public class ArCl5 {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("Red Bull");
        words.add("White Angel");
        words.add("Yellow Sun");
        words.add("Green Apple");
        System.out.println("Array List : " + words);

        for(int i = 0; i < words.size(); i++){
            String Black = words.get(i);
            Black = Black.replace("Red", "BLACK");
            Black = Black.replace("White", "BLACK");
            Black = Black.replace("Yellow", "BLACK");
            Black = Black.replace("Green", "BLACK");

            words.set(i, Black);
        }
        System.out.println("Array List With Only Black Colour : " + words);
    }
}