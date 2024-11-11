package saving_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "output.txt";
        createFile(path);
        writeToFile(path, "I still like C# better");
    }

    static void createFile(String path) {
        try {
            File file = new File(path);

            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch(IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static void writeToFile(String filePath, String message) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);

            fileWriter.write(message);
            fileWriter.close();

            System.out.println("Message (" + message + ") has been written to file (" + filePath + ")");
        } catch(IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
