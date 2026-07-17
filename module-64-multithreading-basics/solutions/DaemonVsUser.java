public class DaemonVsUser {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.print(".");
                try { Thread.sleep(200); } catch (InterruptedException e) { break; }
            }
        }, "DotPrinter");
        daemon.setDaemon(true);
        daemon.start();

        Thread user = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("User working... " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) { break; }
            }
            System.out.println("User thread done");
        }, "Worker");
        user.start();

        System.out.println("Main: JVM will exit when only daemon thread remains");
    }
}
