package hu.fileIrasOlvasas;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writer(String fileToWrite, String sentence){
        try {
            FileWriter fileWriter = new FileWriter(fileToWrite);
            fileWriter.write(sentence);
            fileWriter.close();
            System.out.println("Success!");
        } catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
