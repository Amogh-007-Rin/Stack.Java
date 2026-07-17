public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        WorkerThread worker = new WorkerThread();
        worker.setName("Worker-1");
        worker.start();

        System.out.println("Main thread finished");
    }
}

class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running in " + getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": count " + i);
        }
    }
}
