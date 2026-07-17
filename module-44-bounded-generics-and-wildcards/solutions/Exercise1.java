public class Exercise1 {
    public static void main(String[] args) {
        ComparablePair<Integer> intPair = new ComparablePair<>(10, 25);
        System.out.println("Max of 10 and 25: " + intPair.max());

        ComparablePair<String> strPair = new ComparablePair<>("apple", "banana");
        System.out.println("Max of apple and banana: " + strPair.max());
    }
}

class ComparablePair<T extends Comparable<T>> {
    private final T first;
    private final T second;

    public ComparablePair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T max() {
        return first.compareTo(second) > 0 ? first : second;
    }
}
