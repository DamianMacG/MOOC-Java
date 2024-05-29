
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get(file))) {

            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                if (age == 1) {

                    System.out.println(name + ", age: " + age + " year");
                    System.out.println("Age: " + age);
                } else {
                    System.out.println(name + ", age: " + age + " years");
                    System.out.println("Age: " + age);
                }
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
