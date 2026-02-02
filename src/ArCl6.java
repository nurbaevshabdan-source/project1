//ArraysList; Class_Practise 6
import java.util.ArrayList;

public class ArCl6 {
    public static void main(String[] args){
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Volleyball");
        sports.add("Tennis");
        System.out.println("Array List : " + sports);
        System.out.println("");
        ArrayList<String> subList = new ArrayList<>();
        subList.add("Football");
        subList.add("Tennis");
        System.out.println("subList : " + subList);

        if (sports.containsAll(subList)) {
            System.out.println("YES! There are Football and Tennis");
        } else{System.out.println("NO, there is no Football and Tennis");}
    }
}