/*Q4 - Create an abstract class BankAccount with: Fields: accountNumber, balance, Methods: deposit(), abstract withdraw().
Create subclasses: SavingsAccount (no overdraft allowed), CurrentAccount (overdraft allowed up to ₹10,000)
Write a Java program to:
Create objects of both accounts, Perform deposit and withdrawal operations, Display final balances.*/

abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds! Withdrawal failed.");
        }
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit = 10000;

    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded! Withdrawal failed.");
        }
    }
}

class BankTest {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount("SA123", 5000);
        BankAccount c = new CurrentAccount("CA456", 2000);

        s.deposit(2000);
        s.withdraw(1000);
        s.displayBalance();

        c.deposit(3000);
        c.withdraw(12000); // overdraft allowed
        c.displayBalance();
    }
}
