import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Exercise03Solution {
    // Run this main for the server
    public static class TimeServer {
        public static void main(String[] args) {
            int port = 7779;
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                System.out.println("TimeServer on port " + port);
                try (Socket client = serverSocket.accept();
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(client.getInputStream()));
                     PrintWriter out = new PrintWriter(
                             client.getOutputStream(), true)) {

                    String line;
                    while ((line = in.readLine()) != null) {
                        if ("time".equalsIgnoreCase(line)) {
                            out.println(LocalDateTime.now().toString());
                        } else if ("bye".equalsIgnoreCase(line)) {
                            break;
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Server error: " + e.getMessage());
            }
        }
    }

    // Run this main for the client
    public static class TimeClient {
        public static void main(String[] args) {
            try (Socket socket = new Socket("localhost", 7779);
                 PrintWriter out = new PrintWriter(
                         socket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()));
                 BufferedReader console = new BufferedReader(
                         new InputStreamReader(System.in))) {

                System.out.print("Enter 'time' to get server time: ");
                String input = console.readLine();
                out.println(input);
                String response = in.readLine();
                System.out.println("Server time: " + response);

            } catch (IOException e) {
                System.err.println("Client error: " + e.getMessage());
            }
        }
    }
}
