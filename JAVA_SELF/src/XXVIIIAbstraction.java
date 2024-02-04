public class XXVIIIAbstraction {
    public static void main(String[] args) {

        // abstract = abstract class cannot be instantiated, but they can have a subclass
        //          -> abstract methods are declared without an implementation

        // Vehicle2 vehicle = new Vehicle2();

        Car3 car = new Car3();
        car.go();
    }
}
