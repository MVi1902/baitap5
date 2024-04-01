import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Specify server hostname and port number
            String hostname = "localhost";
            int port = 12345;

            // Create a socket connection to the server
            Socket socket = new Socket(hostname, port);

            // Get input from the user
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter text to send: ");
            String message = userInput.readLine();

            // Send the message to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(message);

            System.out.println("Message sent to server.");

            // Close the connection (optional - server might handle closing)
            // socket.close();

        } catch (UnknownHostException e) {
            System.err.println("Couldn't find host: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
