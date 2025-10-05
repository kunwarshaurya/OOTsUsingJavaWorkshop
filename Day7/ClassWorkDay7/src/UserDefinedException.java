// custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

//  use of  the custom exception
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}


public class UserDefinedException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(500);  // This will succeed
            account.withdraw(600);  // This will fail and throw the exception
        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}