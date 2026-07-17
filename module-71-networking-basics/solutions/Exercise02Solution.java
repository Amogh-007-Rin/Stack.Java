import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Exercise02Solution {
    private static final String[] QUOTES = {
        "Java is to JavaScript as car is to carpet.",
        "Debugging is twice as hard as writing the code.",
        "First, solve the problem. Then, write the code.",
        "Any fool can write code that a computer can understand.",
        "Simplicity is prerequisite for reliability."
    };

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int port = 7781;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("QuoteServer on port " + port);

            try (Socket client = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(client.getInputStream()));
                 PrintWriter out = new PrintWriter(
                         client.getOutputStream(), true)) {

                String line;
                while ((line = in.readLine()) != null) {
                    if ("quote".equalsIgnoreCase(line)) {
                        out.println(QUOTES[RANDOM.nextInt(QUOTES.length)]);
                    } else if ("bye".equalsIgnoreCase(line)) {
                        out.println("Goodbye!");
                        break;
                    } else {
                        out.println("Unknown command. Try 'quote' or 'bye'.");
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
