
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        String first = scan.nextLine();

        if (Integer.parseInt(first) <= 120 && Integer.parseInt(first) >= 0) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
