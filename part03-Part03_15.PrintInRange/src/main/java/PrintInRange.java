
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(3);
        // list.add(5);
        // list.add(7);
        // list.add(9);

        // System.out.println("The numbers in the range [0, 5]");
        // printNumbersInRange(list, 0, 5);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

}