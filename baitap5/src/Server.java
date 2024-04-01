import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket on the specified port
            int port = 12345;
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Server started on port " + port);

            // Wait for a client connection
            Socket clientSocket = serverSocket.accept();

            // Receive the message from the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();

            System.out.println("Received message from client: " + message);

            // Close the connection (optional - client might handle closing)
            // clientSocket.close();

            // Optionally, send a response back to the client (commented out)
            // PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            // out.println("Server response: Message received!");

            serverSocket.close(); // Close the server socket after handling the connection

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
