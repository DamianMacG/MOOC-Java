
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 0) {
                break;
            } else if (command > 0) {
                System.out.println(command * command);
            } else if (command < 0) {
                System.out.println("Unsuitable number");
            }
        }

    }
}
