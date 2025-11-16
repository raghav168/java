import java.io.File;

class ChangeFilePermissions {
    public static void main(String[] args) {
        System.out.println("Raghav , 24csu168");

        File file = new File("/Users/Raghav/Documents");

        if (file.exists()) {
            System.out.println(file.getName() + " file exists.");

        
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);

            System.out.println("File permissions updated successfully!");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("File does not exist.");
        }
    }
}