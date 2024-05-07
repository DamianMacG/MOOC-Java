
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Matthew = new Account("Matthews account", 1000.0);
        Account Damian = new Account("My account", 0.0);

        Matthew.withdrawal(100.0);
        Damian.deposit(100.0);

        System.out.println(Matthew);
        System.out.println(Damian);
    }
}
