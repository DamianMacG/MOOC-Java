
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        int end = 1;
        while (end <= number) {
            System.out.println(number);
            number--;
        }
    }

}
