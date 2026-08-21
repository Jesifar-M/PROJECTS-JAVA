package booklog;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;

public class BookLog {

    public static void main(String[] args) {

        String fileName = "log.txt";

        try {
            // Create the file
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Write message
            FileWriter writer = new FileWriter(file);

            String message = "Book order placed at " + LocalTime.now();

            writer.write(message);
            writer.close();

            System.out.println("Message written successfully.");

            // Read message
            FileReader reader = new FileReader(file);

            int character;

            System.out.println("Message from file:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

            System.out.println();
            System.out.println("Message read successfully.");

            // Delete file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File deletion failed.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}