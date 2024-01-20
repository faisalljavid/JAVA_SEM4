import java.util.Scanner;

public class XNestedLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.print("Enter # of rows: ");
        rows = input.nextInt();
        System.out.print("Enter # of columns: ");
        columns = input.nextInt();
        System.out.print("Enter symbol to use: ");
        symbol = input.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
