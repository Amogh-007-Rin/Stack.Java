import java.util.ArrayList;
import java.util.function.Supplier;

class Factory<T> {
    private final Supplier<T> supplier;

    public Factory(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public static <T> Factory<T> create(Supplier<T> supplier) {
        return new Factory<>(supplier);
    }

    public T newInstance() {
        return supplier.get();
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Factory<StringBuilder> sbFactory = Factory.create(StringBuilder::new);
        StringBuilder sb = sbFactory.newInstance();
        sb.append("Hello from factory!");
        System.out.println(sb);

        Factory<ArrayList<String>> listFactory = Factory.create(ArrayList::new);
        ArrayList<String> list = listFactory.newInstance();
        list.add("Item 1");
        list.add("Item 2");
        System.out.println(list);

        Factory<Integer> intFactory = Factory.create(() -> 42);
        Integer num = intFactory.newInstance();
        System.out.println("Number: " + num);
    }
}
