
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int positiveCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                if (number > 0) {
                    sum += number;
                    positiveCount++;
                }
            }
        }

        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / positiveCount;
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
