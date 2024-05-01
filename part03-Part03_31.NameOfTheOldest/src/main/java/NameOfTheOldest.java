
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");

            if (parts.length > 1) {
                int age = Integer.valueOf(parts[1].trim());
                String name1 = parts[0].trim();
                if (age > max) {
                    max = age;
                    name = name1;
                }

            }
            System.out.println(name);
        }

    }
}
