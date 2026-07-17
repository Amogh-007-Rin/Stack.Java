import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class Exercise03Solution {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req1 = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get?id=1")).GET().build();
        HttpRequest req2 = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get?id=2")).GET().build();
        HttpRequest req3 = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get?id=3")).GET().build();

        CompletableFuture<HttpResponse<String>> f1 =
                client.sendAsync(req1, HttpResponse.BodyHandlers.ofString());
        CompletableFuture<HttpResponse<String>> f2 =
                client.sendAsync(req2, HttpResponse.BodyHandlers.ofString());
        CompletableFuture<HttpResponse<String>> f3 =
                client.sendAsync(req3, HttpResponse.BodyHandlers.ofString());

        CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2, f3);
        all.get();

        System.out.println("Response 1 status: " + f1.get().statusCode());
        System.out.println("Response 2 status: " + f2.get().statusCode());
        System.out.println("Response 3 status: " + f3.get().statusCode());
    }
}
