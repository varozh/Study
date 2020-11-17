package other.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestReadFile {
    private String pathInWork = "C:\\Users\\buhdeka\\Desktop\\test.txt";
    private String pathInHome = "C:\\Users\\Admin\\Desktop\\1.txt";
    private File file = new File(pathInHome);
    private Scanner sc = new Scanner(file);
    private List<String> email = new ArrayList<>();
    private List<String> password = new ArrayList<>();

    public TestReadFile() throws FileNotFoundException {
    }

    public void run() {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals(" "))
                continue;
            else {
                email.add(line.split(" ")[0]);
                password.add(line.split(" ")[1]);
            }
        }
        sc.close();
        print();
    }

    private void print() {
        System.out.println("emails:\t\t\t\t пароли:");
        for (int i = 0; i < email.size(); i++) {
            System.out.print(email.get(i) + " - " + password.get(i));
            System.out.println();
        }
//        System.out.println("email: " + email);
//        System.out.println("пароли: " + password);
    }
}
