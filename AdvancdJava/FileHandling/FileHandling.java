package AdvancdJava.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        File myFile = new File("Arqam.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

