package other.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestReadFile {
    private String pathInWork = "C:\\Users\\buhdeka\\Desktop\\test.txt";
    private String pathInHome = "C:\\Users\\Admin\\Desktop\\1.txt";
    private File file = new File(pathInWork);
    private Scanner sc = new Scanner(file);
    private List<String> emailFull = new ArrayList<>();
    private List<String> password = new ArrayList<>();
    private List<String> emailLogin = new ArrayList<>();
    private List<String> emailNameServer = new ArrayList<>();
    private List<String> emailDomen = new ArrayList<>();
    private int count = 0;

    public TestReadFile() throws FileNotFoundException {
    }

    public void run() {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.length() > 1) {
                emailFull.add(line.split(" ")[0]);
                password.add(line.split(" ")[1]);
                count++;
            }
        }
        sc.close();
        creatListEmails();
        printEmail();
    }

    private void creatListEmails() {
        for (int i = 0; i < emailFull.size(); i++) {
            String line = emailFull.get(i);
            emailLogin.add(line.substring(0, line.indexOf("@")));
            line = line.substring(line.indexOf("@") + 1);
            emailNameServer.add(line.substring(0, line.indexOf(".")));
            emailDomen.add(line.substring(line.indexOf(".") + 1));
        }
    }

    private void printEmail() {
        System.out.println("Email:");
        for (int i = 0; i < emailFull.size(); i++) {
            System.out.print(emailLogin.get(i) + " @ " + emailNameServer.get(i) + " . " + emailDomen.get(i) + "\nПароль: " + password.get(i));
            System.out.println();
        }
    }
}
