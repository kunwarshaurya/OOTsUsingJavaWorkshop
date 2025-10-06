import java.io.*;
public class AddLineNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("loremIpsum.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("result.txt"));
        String line;
        int lineNumber = 1;
        while ((line = reader.readLine()) != null) {
            writer.println(lineNumber + ". " + line);
            lineNumber++;
        }
        reader.close();
        writer.close();
        System.out.println("Line numbers added successfully.");
    }
}
