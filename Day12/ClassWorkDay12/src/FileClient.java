import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/kunwarshauryapratapsingh/Documents/test1.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("This is a test file for upload.");
        }

        Socket socket = new Socket("localhost", 5000);
        OutputStream out = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(file);

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }

        System.out.println("File sent successfully.");
        fis.close();
        socket.close();
    }
}
