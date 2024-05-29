import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }
}
