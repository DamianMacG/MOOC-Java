import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            // Prompt for identifier
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            // Prompt for name
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // Create a new Archive object and add it to the list
            Archive newArchive = new Archive(identifier, name);
            if (!archive.contains(newArchive)) {
                archive.add(newArchive);
            }
        }

        // Print all items in the archive
        for (Archive item : archive) {
            System.out.println(item);
        }
    }
}