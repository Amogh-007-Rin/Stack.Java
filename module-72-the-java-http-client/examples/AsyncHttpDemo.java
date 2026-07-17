import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/delay/2"))
                .GET()
                .build();

        System.out.println("Sending async request at " + java.time.LocalTime.now());

        CompletableFuture<HttpResponse<String>> future =
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        // Do other work while waiting...
        System.out.println("Doing other work...");

        HttpResponse<String> response = future.get();

        System.out.println("Received at " + java.time.LocalTime.now());
        System.out.println("Status: " + response.statusCode());
        System.out.println(response.body());
    }
}
