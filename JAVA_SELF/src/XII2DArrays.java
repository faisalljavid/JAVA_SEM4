public class XII2DArrays {
    public static void main(String[] args) {
        String[][] cars = new String[2][3];
        cars[0][0] = "Mustang";
        cars[0][1] = "Corvette";
        cars[0][2] = "Camero";
        cars[1][0] = "Silverado";
        cars[1][1] = "Tesla";
        cars[1][2] = "BMW";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
