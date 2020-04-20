package hu.fileIrasOlvasas;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void createFile(String fileName){
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
