import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Server IP address
        int port = 12345; // Port number the server is listening on

        try (
                Socket socket = new Socket(serverAddress, port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Auto-flush
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.print("Enter message to send to server: ");
            String message = scanner.nextLine();

            // Send the message to the server
            out.println(message);
            System.out.println("Message sent to server.");
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + serverAddress);
        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}