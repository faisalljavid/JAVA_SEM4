public class XVIIIMethods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        String name = "Bro";
        int age = 21;
        hello(name, age); // name = argument
        System.out.println("-------------------");

        int x = 3;
        int y = 4;
        System.out.println(add(x,y));
    }

    static void hello(String title, int age) { // title = parameter
        System.out.println("Hello " + title);
        System.out.println("You are " + age + " years old");
    }

    static int add(int x, int y) {
        return x + y;
    }
}
