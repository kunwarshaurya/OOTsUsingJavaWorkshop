import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("File Server waiting for client...");
        Socket socket = serverSocket.accept();

        InputStream in = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("received.txt");

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        System.out.println("File received successfully.");
        fos.close();
        socket.close();
        serverSocket.close();
    }
}
