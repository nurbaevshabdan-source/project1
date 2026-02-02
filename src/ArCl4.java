//ArraysList; Class_Practise 4
import java.util.ArrayList;

public class ArCl4 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Beshbarmak");
        fruits.add("Pizza Mozzarella");
        fruits.add("Banana");
        fruits.add("Candies");
        fruits.add("Plov!");
        fruits.add("Banana");
        fruits.add("Pizza And Sushi And Hamburgerrr");
        fruits.add("Banana");
        System.out.println("Array List : " + fruits);

        for(int i = 0; i < fruits.size(); i++){
            String fruit = fruits.get(i);
            if(fruit.contains("Banana")){
                fruits.remove(i);
            }
        }
        System.out.println("Array List Without Bananas : " + fruits);
    }
}