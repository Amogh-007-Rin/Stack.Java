public class BoxDemo {
    public static void main(String[] args) {
        System.out.println("=== Generic Box Class ===");

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        String message = stringBox.get();
        System.out.println("String box: " + message);

        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        int number = intBox.get();
        System.out.println("Integer box: " + number);

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        double pi = doubleBox.get();
        System.out.println("Double box: " + pi);
    }
}

class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}
