import java.util.ArrayList;

public class XVI2DArrayList {
    public static void main(String[] args) {
        // 2D ArrayList = a dynamic list of lists
        // we can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        System.out.println(bakeryList);

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("peppers");
        produceList.add("potatoes");

        System.out.println(produceList);

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        System.out.println(drinksList);
        System.out.println("---------------------------------");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1)); // 2nd element of first list
    }
}
