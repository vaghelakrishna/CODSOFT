
public class ATM_Interface {

    public static void main(String args[]) {
        bankAccount account = new bankAccount(10002);
        ATM atm = new ATM(account);
        atm.start();
    }
}
