//ArraysList; Class_Practise 8
import java.util.ArrayList;

public class ArCl8 {
    public static void main(String[] args){
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Tulip");
        flowers.add("Dahlia");
        flowers.add("Peonies");
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Gerbera");
        flowers.add("Peonies");
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Lilly");
        flowers.add("Iris");
        flowers.add("Iris");
        flowers.add("Rose");
        System.out.println("Array List : " + flowers);
        System.out.println(" ");

        ArrayList<String> noDuplicates = new ArrayList<>();

        for(String flower : flowers){
            if(!noDuplicates.contains(flower)){
                noDuplicates.add(flower);
            }
        }
        System.out.println("ArrayList Without Duplicates : " + noDuplicates);
    }
}