public class Exercise1 {
    public static void main(String[] args) {
        Storage<String> stringStore = new Storage<>();
        stringStore.store("Hello");
        System.out.println("Retrieved: " + stringStore.retrieve());
        System.out.println("Is empty: " + stringStore.isEmpty());

        Storage<Integer> intStore = new Storage<>();
        intStore.store(100);
        System.out.println("Retrieved: " + intStore.retrieve());

        Storage<Double> doubleStore = new Storage<>();
        System.out.println("Is empty: " + doubleStore.isEmpty());
        doubleStore.store(3.14);
        System.out.println("Retrieved: " + doubleStore.retrieve());
        System.out.println("Is empty: " + doubleStore.isEmpty());
    }
}

class Storage<T> {
    private T item;
    private boolean hasValue = false;

    public void store(T item) {
        this.item = item;
        this.hasValue = true;
    }

    public T retrieve() {
        return item;
    }

    public boolean isEmpty() {
        return !hasValue;
    }
}
