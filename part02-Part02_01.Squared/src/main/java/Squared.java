
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int input = Integer.valueOf(reader.nextLine());

        // Identifying the operation and declaring a variable for the result
        int product = input * input;

        // Printing the result of the operation
        System.out.println(product);

    }
}
