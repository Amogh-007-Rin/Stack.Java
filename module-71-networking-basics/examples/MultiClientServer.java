import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {
    public static void main(String[] args) {
        int port = 7778;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("MultiClientServer on port " + port);

            while (true) {
                System.out.println("Waiting for a client...");
                try (Socket client = serverSocket.accept();
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(client.getInputStream()));
                     PrintWriter out = new PrintWriter(
                             client.getOutputStream(), true)) {

                    System.out.println("Handling client: "
                            + client.getInetAddress());

                    String line;
                    while ((line = in.readLine()) != null) {
                        out.println("Echo: " + line);
                        if ("bye".equalsIgnoreCase(line)) {
                            break;
                        }
                    }
                    System.out.println("Client disconnected.");
                }
            }

        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
