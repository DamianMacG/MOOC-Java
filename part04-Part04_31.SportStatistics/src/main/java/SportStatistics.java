import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File: ");
        String file = scanner.nextLine();
        System.out.print("Team: ");
        String team = scanner.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;
        Path filename = Paths.get(file);

        try (Scanner fileReader = new Scanner(filename)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");

                String name1 = parts[0];
                String name2 = parts[1];
                int name1Points = Integer.valueOf(parts[2]);
                int name2Points = Integer.valueOf(parts[3]);

                if (name1.equals(team) || name2.equals(team)) {
                    count++;
                    if ((name1.equals(team) && name1Points > name2Points) ||
                            (name2.equals(team) && name2Points > name1Points)) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Could not read the specified file.");
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
