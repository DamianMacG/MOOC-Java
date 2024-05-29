
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<String> list = new ArrayList<>();

        Path filename = Paths.get(file);

        try {
            list.addAll(Files.readAllLines(filename));
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = Integer.valueOf(list.get(i));
            if (num >= lowerBound && num <= upperBound) {
                count++;
            }

        }
        System.out.println("Numbers: " + count);

    }

}
