interface DataProcessor {
    void process(String data);

    default void validate(String data) {
        if (data == null || data.isBlank()) {
            System.out.println("Warning: data is null or blank");
        } else {
            System.out.println("Data is valid");
        }
    }

    static boolean isNullOrBlank(String data) {
        return data == null || data.isBlank();
    }
}

class UpperCaseProcessor implements DataProcessor {
    @Override
    public void process(String data) {
        System.out.println(data.toUpperCase());
    }
}

public class Exercise2Solution {
    public static void main(String[] args) {
        UpperCaseProcessor proc = new UpperCaseProcessor();

        String data = "hello world";
        proc.validate(data);
        proc.process(data);

        String empty = "";
        proc.validate(empty);

        System.out.println("Is 'test' null or blank? " + DataProcessor.isNullOrBlank("test"));
        System.out.println("Is '' null or blank? " + DataProcessor.isNullOrBlank(""));
    }
}
