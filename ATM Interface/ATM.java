
import java.util.Scanner;

public class ATM {

    Scanner sc = new Scanner(System.in);
    private final bankAccount account;

    public ATM(bankAccount account) {
        this.account = account;
    }

    public void start() {
        int choice;
        System.out.println("1 . Check Bank Balance");
        System.out.println("2 . Withdraw Money");
        System.out.println("3 . Deposit Money");
        choice = sc.nextInt();

        switch (choice) {
            case 1 ->
                checkBalance();
            case 2 ->
                withdrawMoney(sc);
            case 3 ->
                depositMoney(sc);
            default ->
                System.out.println("enter valid choice....!");
        }
    }

    private void checkBalance() {
        System.out.println("Your Balance is : " + account.getBalance());
    }

    private void depositMoney(Scanner sc) {
        System.out.println("Enter amount for diposit : ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("sucessfully deposit amount $" + amount);
            System.out.println("new balance :" + account.getBalance());

        } else {
            System.out.println("invalid");

        }
    }

    private void withdrawMoney(Scanner sc) {
        System.out.print("Enter amount for withdraw : ");
        double amount = sc.nextDouble();

        if (amount > 0 && account.withdraw(amount)) {
            System.out.println("sucessfully withdraw amount $" + amount);
            System.out.println("new balance : " + account.getBalance());

        } else if (amount <= 0) {
            System.out.println("invalid");
        } else {
            System.out.println("transaction failed");
        }
    }

}
