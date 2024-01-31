import java.util.ArrayList;

public class XVArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>(); // to store primitive data types, then use wrapper class
        food.add("Pizza");
        food.add("Burger");
        food.add("Noodles");

        food.set(0, "Sushi"); // sets at particular index
        food.remove(2); // removes at particular index
        // food.clear();  clears everything

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
