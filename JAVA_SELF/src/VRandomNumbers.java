import java.util.Random;

public class VRandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(6)+1; // for dice thing; now it'll give from 1 to 6
        System.out.println(x);
    }
}
