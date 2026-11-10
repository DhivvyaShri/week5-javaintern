import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4_FileHandling {

    public static void main(String[] args) {

        String fileName = "students.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Student ID: 101\n");
            writer.write("Student Name: Dhivvya\n");
            writer.write("Course: Computer Science\n");
            writer.write("Marks: 90\n");

            writer.close();

            System.out.println("Student records written successfully.");

            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}