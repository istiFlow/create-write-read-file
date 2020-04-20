package hu.fileIrasOlvasas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    public static void printFile(String filePath) {
        FileReader fileReader = null;
        BufferedReader reader = null;

        try {
            File file = new File(filePath);
            fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        } finally {
            try {
                fileReader.close();
                reader.close();
            } catch (IOException iox) {
                iox.printStackTrace();
            }
        }
    }
}
