public class Exercise2 {
    public static void main(String[] args) {
        Pair<String, Integer> original = new Pair<>("Age", 30);
        System.out.println("Original: " + original.getFirst() + " -> " + original.getSecond());

        Pair<Integer, String> swapped = original.swap();
        System.out.println("Swapped: " + swapped.getFirst() + " -> " + swapped.getSecond());
    }
}

class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }

    public Pair<U, T> swap() {
        return new Pair<>(second, first);
    }
}
