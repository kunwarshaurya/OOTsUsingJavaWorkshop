import java.io.*;
public class WordCounter {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytesArray = new byte[(int)file.length()];
        fis.read(bytesArray);
        String s = new String(bytesArray);
        String[] data = s.split("\\s+");
        System.out.println("Number of words in the file: " + data.length);
        fis.close();
    }
}