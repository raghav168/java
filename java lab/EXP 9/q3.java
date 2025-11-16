import java.io.*;

class SimpleFileReadWrite {
    public static void main(String[] args) {
 System.out.println("Raghav 24csu168");
        try {
            
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a simple file write and read example in Java.\n");
            writer.write("This is the second line.");
            writer.close();  
            System.out.println("Data written successfully to file.");

            
            FileReader reader = new FileReader("example.txt");
            int ch;
            System.out.println("\nReading data from file:");
            while ((ch = reader.read()) != -1) {   
                System.out.print((char) ch);
            }
            reader.close();  

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}