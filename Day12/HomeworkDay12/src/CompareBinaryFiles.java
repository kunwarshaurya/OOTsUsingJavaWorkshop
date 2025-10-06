import java.io.*;
public class CompareBinaryFiles {
    public static void main(String[] args) throws IOException {
        try (FileInputStream f1 = new FileInputStream("file1.bin");
             FileInputStream f2 = new FileInputStream("file2.bin")) {
            if (f1.getChannel().size() != f2.getChannel().size()) {
                System.out.println("Files are different (different sizes).");
                return;
            }
            int byte1, byte2;
            do {
                byte1 = f1.read();
                byte2 = f2.read();
                if (byte1 != byte2) {
                    System.out.println("Files are different.");
                    return;
                }
            } while (byte1 != -1 && byte2 != -1);
            System.out.println("Files are identical.");
        }
    }
}
