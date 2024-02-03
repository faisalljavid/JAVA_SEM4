public class XXVItoString {
    public static void main(String[] args) {
        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object
        //            -> can be used implicitly and explicitly

        Car car = new Car();

        //System.out.println(car.toString());  // (explicitly)
        System.out.println(car); // or use this (implicitly)
    }
}
