
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number?");
        int number1 = Integer.valueOf(scanner.nextLine());

        int sum = 1;

        for (int i = 1; i <= number1; i++) {
            sum *= i;
        }
        System.out.println("Factorial: " + sum);

    }
}
