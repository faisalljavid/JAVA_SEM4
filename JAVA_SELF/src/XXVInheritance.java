public class XXVInheritance {
    public static void main(String[] args) {
        // inheritance = the process where one class acquires,
        //                the attributes and methods of another.

        Bike bike = new Bike();
        bike.go();

        Tricycle tricycle = new Tricycle();
        tricycle.stop();

        System.out.println(bike.speed);
        System.out.println(tricycle.speed);

        System.out.println(bike.motor);
        System.out.println(tricycle.pedals);
    }
}
