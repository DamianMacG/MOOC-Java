public class AdvancedAstrology {

    public static void printStars(int number) {
        int start = 0;
        while (number > start) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int start = 0;
        while (start < number) {
            System.out.print(" ");
            start++;
        }
    }

    public static void printTriangle(int size) {
        int start = 1;
        int spaces = size - 1;
        while (start <= size) {
            printSpaces(spaces);
            printStars(start);
            start++;
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        for (int i = 1; i < 3; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
