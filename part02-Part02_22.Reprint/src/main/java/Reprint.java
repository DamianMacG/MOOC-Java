
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times?");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        while (sum <= num) {

            printText();
            sum++;
        }

    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
