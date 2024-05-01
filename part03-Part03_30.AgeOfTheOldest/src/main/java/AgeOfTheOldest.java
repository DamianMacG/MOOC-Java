
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");

            if (parts.length > 1) {
                int age = Integer.valueOf(parts[1].trim());
                if (age > max) {
                    max = age;
                }

            }
            System.out.println(max);
        }
    }
}
