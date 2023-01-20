import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    public static void main(String[] args) throws IOException {
        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\Desktop\\text.txt")));
        String[] massive = string.split("[\\s]");
        String[] words = string.split("[\\s]+");
        String letters = String.join("", words);
        String[] sentence = string.split("[\\W]");
        System.out.println("words" + " " + massive.length);
        System.out.println("letter " + " " + letters.length());
        System.out.println("sentence " + sentence.length);

    }
}



