public class XXIXEncapsulation {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private
        //               -> can be accessed only through methods (getters & setters)
        //               -> You should make attributes private if you don't have a reason to make them public/protected

        Car4 car = new Car4("Ford", "Mustang", 1980);
        

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
