import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Assignment1 {
    public static void writeFile(String content, String to) throws IOException {
        FileWriter fw = new FileWriter(to, false);
        PrintWriter pw = new PrintWriter(fw);

        pw.print(content);

        fw.close();
        pw.close();
    }

    public static String readFile(String from) throws IOException {
        return Files.readString(Path.of(from));
    }

    public static int countCharacters(String fileName) throws IOException{
        return readFile(fileName).length();
    }

    public static void main (String[] args) throws IOException{
        writeFile("hello", "test.txt");
        System.out.println(readFile("test.txt"));
        System.out.println(countCharacters("test.txt"));

    }
}
