import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exercise01Solution {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get?foo=bar&baz=qux"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(
                request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();
        System.out.println("Full body:");
        System.out.println(body);

        int argsStart = body.indexOf("\"args\"");
        if (argsStart != -1) {
            int valueStart = body.indexOf('{', argsStart);
            int valueEnd = body.indexOf('}', valueStart) + 1;
            System.out.println("\nExtracted args: " + body.substring(valueStart, valueEnd));
        }
    }
}
