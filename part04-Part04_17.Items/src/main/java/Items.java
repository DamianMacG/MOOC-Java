import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // Create a list to store Item objects
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read item names from the user
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // Add a new Item to the list
            items.add(new Item(name));
        }

        // Print all items using their toString method
        for (Item item : items) {
            System.out.println(item);
        }

    }
}
