
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {

        int index = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String word = scanner.nextLine();
            if (!word.equals("end")) {
                index = index + 1;
            } else {
                break;
            }

        }
        System.out.print(index);
    }
}
