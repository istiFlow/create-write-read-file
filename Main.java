package hu.fileIrasOlvasas;

public class Main {

    public static void main(String[] args) {

        //create a file
        CreateFile.createFile("test.txt");

        //write to file
        Writer.writer("test.txt", "Hello, I'm a sentence who would be in test.txt");

        //read from file
        Read.printFile("test.txt");
    }
}
