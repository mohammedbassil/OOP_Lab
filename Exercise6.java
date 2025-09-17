// Interface for Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Interface for Transaction
interface Transaction {
    void transfer(Account from, Account to, double amount);
}

// Class implementing Account
class SavingsAccount implements Account {
    private double balance;

    SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Class implementing Transaction
class BankTransaction implements Transaction {
    @Override
    public void transfer(Account from, Account to, double amount) {
        if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Transferred " + amount + " successfully.");
        } else {
            System.out.println("Transfer failed! Insufficient balance.");
        }
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // Create accounts
        Account acc1 = new SavingsAccount(5000);
        Account acc2 = new SavingsAccount(2000);

        // Show balances
        System.out.println("Initial Balance of Acc1: " + acc1.getBalance());
        System.out.println("Initial Balance of Acc2: " + acc2.getBalance());

        // Deposit and Withdraw
        acc1.deposit(1000);
        acc1.withdraw(2000);

        // Transfer
        Transaction txn = new BankTransaction();
        txn.transfer(acc1, acc2, 1500);

        // Final balances
        System.out.println("Final Balance of Acc1: " + acc1.getBalance());
        System.out.println("Final Balance of Acc2: " + acc2.getBalance());
    }
}
