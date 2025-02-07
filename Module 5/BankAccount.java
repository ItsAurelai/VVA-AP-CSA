/**
 * Represents a bank account with a name, account number, and balance.
 * 
 * @author Aurelai Rickert
 * @version 1.0 (December 11, 2024)
 */
public class BankAccount {
    /**
     * The name of the account holder.
     */
    private String name;
    /**
     * The account number.
     */
    private int accountNumber;
    /**
     * The balance in the account.
     */
    private double balance;

    /**
     * Constructs a BankAccount object with the specified name, account number, and balance.
     *
     * @param name          the name of the account holder
     * @param accountNumber the account number
     * @param balance       the initial balance
     */
    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Constructs a BankAccount object with the specified name and account number, initializing the balance to 0.
     *
     * @param name          the name of the account holder
     * @param accountNumber the account number
     */
    public BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Returns a string representation of the BankAccount object.
     *
     * @return a string representation of the BankAccount object
     */
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    /**
     * This is the main method of the BankAccount class. It creates a BankAccount object, 
     * performs deposit and withdrawal operations, and prints the account details to the console.
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 12345, 1000.0);
        System.out.println(account);

        account.deposit(500.0);
        System.out.println(account);

        account.withdraw(200.0);
        System.out.println(account);
    }
}
