import java.util.List;

sealed interface JsonValue permits JsonString, JsonNumber, JsonArray, JsonNull {
    String toJson();
}

record JsonString(String value) implements JsonValue {
    @Override
    public String toJson() { return "\"" + value.replace("\"", "\\\"") + "\""; }
}

record JsonNumber(double value) implements JsonValue {
    @Override
    public String toJson() {
        if (value == Math.floor(value) && !Double.isInfinite(value)) {
            return String.valueOf((long) value);
        }
        return String.valueOf(value);
    }
}

record JsonArray(List<JsonValue> elements) implements JsonValue {
    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elements.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(elements.get(i).toJson());
        }
        return sb.append("]").toString();
    }
}

record JsonNull() implements JsonValue {
    @Override
    public String toJson() { return "null"; }
}

public class Exercise2 {
    public static void main(String[] args) {
        JsonValue json = new JsonArray(List.of(
            new JsonString("hello"),
            new JsonNumber(42),
            new JsonNumber(3.14),
            new JsonNull(),
            new JsonArray(List.of(new JsonString("nested"), new JsonNumber(1)))
        ));
        System.out.println(json.toJson());
    }
}
