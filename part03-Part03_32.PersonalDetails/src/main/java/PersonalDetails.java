import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0; // Track the count of valid inputs
        String name = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");

            if (parts.length > 1) {
                int age = Integer.valueOf(parts[1].trim());
                sum = sum + age;
                count++; // Increment the count of valid inputs
                String name1 = parts[0].trim();
                if (name1.length() > name.length()) {
                    name = name1;
                }

            }
        }

        // Calculate average after all input is processed
        double average = (double) sum / count;

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
