import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tester {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/file.txt.txt"))) {
            reader.lines().forEach(line -> System.out.println(line));
        } catch (IOException e){
            System.out.println("An IOException is : " + e.getMessage());
        }

    }

}
