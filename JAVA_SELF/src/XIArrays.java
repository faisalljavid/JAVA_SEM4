public class XIArrays {
    public static void main(String[] args) {
       // Ist method
        String[] cars = {"Camero", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
        System.out.println(cars[3]);

        // 2nd method
        String[] places = new String[3];
        places[0] = "NY";
        places[1] = "Kashmir";
        places[2] = "Delhi";
        for (int i = 0; i < places.length; i++) {
            System.out.print(places[i] + " ");
        }
    }
}
