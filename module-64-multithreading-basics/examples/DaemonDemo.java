public class DaemonDemo {
    public static void main(String[] args) {
        Thread userThread = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("User thread: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) { break; }
            }
            System.out.println("User thread finished");
        }, "User");

        Thread daemonThread = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("Daemon thread: " + (++i));
                try { Thread.sleep(200); } catch (InterruptedException e) { break; }
            }
        }, "Daemon");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ending (JVM will exit when only daemon threads remain)");
    }
}
