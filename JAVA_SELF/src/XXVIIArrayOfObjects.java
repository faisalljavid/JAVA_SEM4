public class XXVIIArrayOfObjects {
    public static void main(String[] args) {
        // Food[] refrigerator = new Food[3]; // # one-way

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Ice Cream");

        Food[] refrigerator = {food1, food2, food3};

//        # one-way
//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
}
