package files;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class AssignmentFile {

    public static void main(String[] args) {

        String fileName = "assignment.txt";

        try {
            // 1. Create the file
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write content into the file
            FileWriter writer = new FileWriter(file);

            writer.write("Java File Handling Practice");

            writer.close();

            System.out.println("Content written successfully.");

            // 3. Read content from the file
            FileReader reader = new FileReader(file);

            int character;

            System.out.println("File content:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

            System.out.println();
            System.out.println("Content read successfully.");

            // 4. Delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}