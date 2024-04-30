
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int smallest = Collections.min(list);

        System.out.println("Smallest number: " + smallest);
        // int input1 = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest)
                System.out.println("Found at index: " + i);

        }

    }
}
