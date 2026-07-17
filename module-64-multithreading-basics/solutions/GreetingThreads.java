public class GreetingThreads {
    public static void main(String[] args) {
        Thread byExtension = new GreetingThread();
        byExtension.setName("ExtendsThread");
        byExtension.start();

        Thread byRunnable = new Thread(new GreetingRunnable(), "ImplementsRunnable");
        byRunnable.start();
    }
}

class GreetingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from " + getName());
    }
}

class GreetingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
