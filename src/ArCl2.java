//ArraysList; Class_Practise 2
import java.util.ArrayList;

public class ArCl2 {
    public static void main(String[] args) {
        ArrayList<String> films = new ArrayList<>();
        films.add("Interstellar");
        films.add("1+1");
        films.add("Gentlemen");
        films.add("Shutter Island");
        films.add("The Shawshank Redemption");
        System.out.println("Array List : " + films);

        String longestString = " ";
        for(String film : films){
            if (longestString.length() < film.length()) {
                longestString = film;

            }
        }
        System.out.println("Longest String : " + longestString + " >> size = " + longestString.length());
    }
}