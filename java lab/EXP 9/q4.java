import java.io.*;

class BufferedFileExample {
    public static void main(String[] args) {
      System.out.println("Raghav 24csu168");
        String fileName = "students.txt";

        try {
           
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Serial No\tFirst Name\tCGPA\tGrade");
            bw.newLine();
            bw.write("1\tRiya\t8.7\tA");
            bw.newLine();
            bw.write("2\tAman\t7.9\tB");
            bw.newLine();
            bw.write("3\tNeha\t9.2\tA");
            bw.newLine();
            bw.close();
            System.out.println("Data written successfully.");

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nContents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}