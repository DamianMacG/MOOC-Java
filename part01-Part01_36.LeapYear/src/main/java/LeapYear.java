
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        String year = scan.nextLine();
        if (Integer.parseInt(year) % 400 == 0 && Integer.parseInt(year) % 100 == 0) {
            System.out.println("The year is a leap year.");
        } else if (Integer.parseInt(year) % 400 != 0 && Integer.parseInt(year) % 100 == 0) {
            System.out.println("The year is not a leap year.");
        } else if (Integer.parseInt(year) % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
