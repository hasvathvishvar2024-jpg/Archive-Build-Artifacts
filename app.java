import java.io.FileWriter;
import java.io.IOException;

public class app {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("report.txt");

            file.write("Student Application Report\n");
            file.write("Total Students: 120\n");
            file.write("Active Students: 45\n");

            file.close();

            System.out.println("Report generated.");
        } catch (IOException e) {
            System.out.println("Error generating report.");
        }
    }
}