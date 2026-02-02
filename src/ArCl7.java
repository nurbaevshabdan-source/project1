//ArraysList; Class_Practise 7
import java.util.ArrayList;

public class ArCl7 {
    public static void main(String[] args){
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Dahlia");
        flowers.add("Peonies");
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Gerbera");
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Lilly");
        flowers.add("Iris");
        flowers.add("Rose");
        System.out.println("Array List : " + flowers);
        System.out.println(" ");

        int firstIndex = flowers.indexOf("Rose");
        int lastIndex = flowers.lastIndexOf("Rose");

        if (firstIndex != -1){
            System.out.println("First Index Of Rose Is " + firstIndex);
            System.out.println("Last Index Of Rose Is " + lastIndex);
        } else {System.out.println("There Is No Rose In The ArrayList");}

    }
}