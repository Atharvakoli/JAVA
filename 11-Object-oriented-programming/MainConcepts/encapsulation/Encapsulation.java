package MainConcepts.encapsulation;

public class Encapsulation {
    // Encapsulation is the bundling of data (variables) and methods (functions)
    // that operate on the data into a single unit or class. It also involves
    // restricting direct access to some of the object's components, which is a
    // means of preventing accidental interference and misuse of the data.

    // Real-life Example:
    // Consider a bank account. You can deposit or withdraw money, but you cannot
    // directly access the account balance without using these specific methods.

    public static void main(String[] args) {
        // Consider a bank account. You can deposit or withdraw money, but you cannot
        // directly access the account balance without using these specific methods.
        BankAccount ba = new BankAccount(500);

        System.out.println(ba.getBalance());
        ba.deposit(500);
        ba.withDraw(800);
        System.out.println(ba.getBalance());

    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withDraw(double amount) {
        if (amount > 50 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
