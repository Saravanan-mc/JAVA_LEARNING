class BankAccount {

    private int balance = 900;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
        }
    }
}

public class SyncExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable r = () -> {
            account.withdraw(500);
        };

        Thread t1 = new Thread(r, "Thread 1");
        Thread t2 = new Thread(r, "Thread 2");

        t1.start();
        t2.start();
    }
}
