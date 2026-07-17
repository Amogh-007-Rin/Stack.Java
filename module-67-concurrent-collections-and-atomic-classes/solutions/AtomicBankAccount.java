import java.util.concurrent.atomic.AtomicLong;

public class AtomicBankAccount {
    private static final AtomicLong balance = new AtomicLong(1000);

    public static void main(String[] args) throws InterruptedException {
        Runnable depositor = () -> {
            for (int i = 0; i < 100; i++) {
                balance.addAndGet(10);
            }
        };

        Runnable withdrawer = () -> {
            for (int i = 0; i < 50; i++) {
                balance.addAndGet(-20);
            }
        };

        Thread t1 = new Thread(depositor);
        Thread t2 = new Thread(withdrawer);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // 100 deposits of 10 = +1000, 50 withdrawals of 20 = -1000
        System.out.println("Final balance: " + balance.get() + " (expected: 1000)");
    }
}
