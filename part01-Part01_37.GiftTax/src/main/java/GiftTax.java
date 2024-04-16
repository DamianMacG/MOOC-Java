
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 25000) {
            System.out.println("Tax: " + (100 + ((gift - 5000) * .08)) * 1.0);
        } else if (gift < 55000) {
            System.out.println("Tax: " + (1700 + ((gift - 25000) * .1)) * 1.0);

        } else if (gift < 200000) {
            System.out.println("Tax: " + (4700 + ((gift - 55000) * .12)) * 1.0);

        } else if (gift < 1000000) {
            System.out.println("Tax: " + (22100 + ((gift - 200000) * .15)) * 1.0);
        } else if (gift > 1000000) {
            System.out.println("Tax: " + (142100 + ((gift - 1000000) * .17)) * 1.0);
        }

    }
}
