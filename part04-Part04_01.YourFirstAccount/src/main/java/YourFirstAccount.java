
public class YourFirstAccount {

    public static void main(String[] args) {
        Account DamianAccount = new Account("Damian's account", 100.00);

        DamianAccount.deposit(20);

        System.out.println(DamianAccount);
    }
}
