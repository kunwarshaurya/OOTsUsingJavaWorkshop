import java.io.*;
public class ReadCharStream {
    public static void main(String[] args) {
        try (FileReader in = new FileReader("/Users/kunwarshauryapratapsingh/Documents/test.txt");
             FileWriter out = new FileWriter("output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) { e.printStackTrace(); }
    }
}
