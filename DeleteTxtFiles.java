import java.io.File;

public class DeleteTxtFiles {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file names as command line arguments.");
            return;
        }

        int deletedCount = 0;

        for (String filename : args) {
            if (filename.endsWith(".txt")) {
                File f = new File(filename);
                if (f.exists() && f.isFile()) {
                    if (f.delete()) {
                        System.out.println("Deleted: " + filename);
                        deletedCount++;
                    } else {
                        System.out.println("Could not delete: " + filename);
                    }
                } else {
                    System.out.println("File not found: " + filename);
                }
            } else {
                System.out.println("Skipping (not a .txt file): " + filename);
            }
        }

        System.out.println("Total .txt files deleted: " + deletedCount);
    }
}