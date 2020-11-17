package other.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestReadFile {
    private String path = "C:\\Users\\buhdeka\\Desktop\\test.txt";
    private File file = new File(path);
    private Scanner sc = new Scanner(file);
    private List<String> email = new ArrayList<>();
    private List<String> password = new ArrayList<>();

    public TestReadFile() throws FileNotFoundException {
    }

    public void run() {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            email.add(line.split(" ")[0]);
            password.add(line.split(" ")[1]);
        }
        sc.close();
        print();
    }

    private void print() {
        System.out.println(email);
        System.out.println(password);
    }
}
