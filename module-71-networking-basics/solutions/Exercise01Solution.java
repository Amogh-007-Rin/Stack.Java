import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Exercise01Solution {
    public static void main(String[] args) {
        int port = 7780;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("UppercaseServer on port " + port);

            try (Socket client = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(client.getInputStream()));
                 PrintWriter out = new PrintWriter(
                         client.getOutputStream(), true)) {

                String line;
                while ((line = in.readLine()) != null) {
                    out.println(line.toUpperCase());
                    if ("bye".equalsIgnoreCase(line)) {
                        break;
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
