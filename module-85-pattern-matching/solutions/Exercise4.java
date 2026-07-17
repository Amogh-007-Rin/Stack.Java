import java.util.function.Function;

sealed interface Result<T> permits Success, Error {
    <U> Result<U> map(Function<T, U> fn);
}

record Success<T>(T value) implements Result<T> {
    @Override
    public <U> Result<U> map(Function<T, U> fn) {
        return new Success<>(fn.apply(value));
    }
}

record Error(String message) implements Result<Object> {
    @Override
    @SuppressWarnings("unchecked")
    public <U> Result<U> map(Function<Object, U> fn) {
        return (Result<U>) this;
    }
}

public class Exercise4 {

    static <T> String describe(Result<T> result) {
        return switch (result) {
            case Success<T> s -> "Success: " + s.value();
            case Error e      -> "Error: " + e.message();
        };
    }

    public static void main(String[] args) {
        Result<Integer> success = new Success<>(42);
        Result<Object> error = new Error("Something went wrong");

        System.out.println(describe(success));
        System.out.println(describe(error));

        System.out.println(describe(success.map(x -> x * 2)));
        System.out.println(describe(error.map(x -> "should not happen")));
    }
}
