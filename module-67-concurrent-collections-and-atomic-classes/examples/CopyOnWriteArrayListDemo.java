import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Runnable reader = () -> {
            for (String s : list) {
                System.out.println("Read: " + s);
                try { Thread.sleep(50); } catch (InterruptedException e) { break; }
            }
        };

        Runnable writer = () -> {
            list.add("D");
            list.add("E");
            System.out.println("Writer added D, E (no ConcurrentModificationException)");
        };

        Thread t1 = new Thread(reader, "Reader");
        Thread t2 = new Thread(writer, "Writer");

        t1.start();
        Thread.sleep(10);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final list: " + list);
    }
}
