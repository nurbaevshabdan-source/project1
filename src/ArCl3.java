//ArraysList; Class_Practise 3
import java.util.ArrayList;

public class ArCl3 {
    public static void main(String[] args){
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Beshbarmak and Pizza");
        foods.add("Pizza Mozzarella");
        foods.add("Candies");
        foods.add("Plov!");
        foods.add("Pizza And Sushi And Hamburgerrr");
        System.out.println("Array List : " + foods);

        int counter = 0;
        for(String food : foods){
            if(food.contains("Pizza")){
                counter += 1;
            }
        }
        System.out.println("Word Pizza Appeared " + counter + " times\uD83D\uDC4D\uD83C\uDFFB");
    }
}
