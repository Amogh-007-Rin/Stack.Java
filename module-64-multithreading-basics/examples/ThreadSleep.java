public class ThreadSleep {
    public static void main(String[] args) {
        Runnable ticker = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " - tick " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(name + " interrupted");
                    return;
                }
            }
        };

        Thread t1 = new Thread(ticker, "Ticker-A");
        Thread t2 = new Thread(ticker, "Ticker-B");

        t1.start();
        t2.start();
    }
}
