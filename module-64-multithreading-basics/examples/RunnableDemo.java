public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = new CountTask();
        Thread thread1 = new Thread(task, "Runnable-1");
        Thread thread2 = new Thread(task, "Runnable-2");

        thread1.start();
        thread2.start();

        System.out.println("Main thread: both workers started");
    }
}

class CountTask implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
        }
    }
}
