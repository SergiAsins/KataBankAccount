public class BankAccount {
    private String titular;
    private double balance;

    // Constructor
    public BankAccount(String titular, double initialBalance) {
        this.titular = titular;
        this.balance = initialBalance;
    }

    // Getter for titular
    public String getTitular() {
        return titular;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
