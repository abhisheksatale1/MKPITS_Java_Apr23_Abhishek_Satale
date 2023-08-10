package ExcaptionHandlingBankExample;

public class BankAccount {

    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
//        if (amount <= 0) {
//            throw new InvalidAmountException("Amount must be greater than 0");
//        }

        balance += amount;
    }

    public void withdraw(double amount) {
//        if (amount <= 0) {
//            throw new InvalidAmountException("Amount must be greater than 0");
//        }

//        if (balance < amount) {
//            throw new InsufficientFundsException("Insufficient funds");
//        }

        balance -= amount;
    }
}

class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

