import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4, 5);
        System.out.println("Average of ints: " + average(ints));

        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        System.out.println("Average of doubles: " + average(doubles));

        List<Long> longs = List.of(10L, 20L, 30L);
        System.out.println("Average of longs: " + average(longs));
    }

    static double average(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum / list.size();
    }
}
