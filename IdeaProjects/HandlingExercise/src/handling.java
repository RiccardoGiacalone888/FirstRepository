import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class handling {
    public static void main(String[] args) {
        String content = "Ciao a tutti";
        Path filePath = Paths.get("example.txt");
        try {
            Files.writeString(filePath, content, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
            System.out.println("File scritto con successo");

        } catch (IIOException e) {
            System.out.println("errore : " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}