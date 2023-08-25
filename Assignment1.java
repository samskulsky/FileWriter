import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Assignment1 {
    public void writeFile(String content, String to) throws IOException {
        FileWriter fw = new FileWriter(to, false);
        PrintWriter pw = new PrintWriter(fw);

        pw.print(content);

        fw.close();
        pw.close();
    }

    public String readFile(String from) throws IOException {
        return Files.readString(Path.of(from));
    }
}
