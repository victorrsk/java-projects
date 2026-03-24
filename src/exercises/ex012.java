package exercises;

import java.util.Objects;
import java.util.Scanner;

public class ex012 {
    static void main(String[] args) {
        BankEx012 account;
        var sc = new Scanner(System.in);
        String accountOwner = sc.next();
        int accountNumber = sc.nextInt();
        System.out.println("Do you want to make a initial deposit?: ");
        String answer = sc.next();

        if (Objects.equals(answer, "y")) {
            double initialDepositValue = sc.nextDouble();
            account = new BankEx012(accountOwner, accountNumber, initialDepositValue);
        } else {
            account = new BankEx012(accountOwner, accountNumber);
        }
        System.out.println(account);

        System.out.println("Enter a deposit value:");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println(account);

        System.out.println("Enter a  withdraw value:");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println(account);

        System.out.println(account.getAccountBalance());

    }
}