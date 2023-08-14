package AdvancdJava.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // Creating file object
        File myFile = new File("Arqam.txt");
        // Trying to create file
//        try {
//            myFile.createNewFile();
//            System.out.println("File created successfully");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Writing in file
      try {
          FileWriter fileWriter = new FileWriter("Arqam.txt");
          fileWriter.write("Hello I am learning file handling in Java");
          fileWriter.close();
      } catch (IOException e) {
          e.printStackTrace();
      }
        // Reading file
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

