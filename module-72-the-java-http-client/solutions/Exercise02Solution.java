import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exercise02Solution {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        String json = "{\"username\": \"testuser\", \"password\": \"secret123\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/post"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> response = client.send(
                request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();

        int jsonField = body.indexOf("\"json\"");
        if (jsonField != -1) {
            int braceStart = body.indexOf('{', jsonField);
            int braceEnd = body.indexOf('}', braceStart) + 1;
            String extractedJson = body.substring(braceStart, braceEnd);
            System.out.println("Extracted JSON field:");
            System.out.println(extractedJson);
        }
    }
}
