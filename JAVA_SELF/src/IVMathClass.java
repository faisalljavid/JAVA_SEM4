import java.util.Scanner;

public class IVMathClass {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = input.nextDouble();
        System.out.println("Enter side y: ");
        y = input.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is: " + z);
        input.close(); // not necessary
    }
}
