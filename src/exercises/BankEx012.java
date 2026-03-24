package exercises;

public class BankEx012 {
    private final int accountNumber;
    private String accountOwner;
    private double accountBalance;

    public BankEx012(String accountOwner, int accountNumber) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
    }
    public BankEx012(String accountOwner, int accountNumber, double initialDepositValue) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        if (initialDepositValue >= 0) {
            this.accountBalance += initialDepositValue;
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountOwner() {
        return this.accountOwner;
    }
    public void setAccountOwner(String name) {
        this.accountOwner = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void withdraw(double value) {
        int withdrawFee = 5;
        this.accountBalance -= value + withdrawFee;
    }

    public void deposit(double value) {
        this.accountBalance += value;
    }

    public String toString() {
        return "Account owner: " + this.accountOwner
                + "\nAccount balance: " + this.accountBalance
                + "\nAccount number: " + this.accountNumber;
    }
}
