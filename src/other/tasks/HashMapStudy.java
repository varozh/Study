package other.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudy {
    private String separator = File.separator;
    private String path = separator + "Users" + separator + "buhdeka" + separator + "Desktop" + separator + "test.txt";

    private String pathInWork = "C:\\Users\\buhdeka\\Desktop\\test.txt";
    private String pathInHome = "C:\\Users\\Admin\\Desktop\\1.txt";
    private File file = new File(path);
    private Scanner sc = new Scanner(file);
    private HashMap <String, Integer> keyValue = new HashMap<String, Integer>();
    private HashMap<String, String> emailsAndName = new HashMap<String, String>();

    public HashMapStudy() throws FileNotFoundException {
        System.out.println(path);
    }

    public void run() {
        task2();
    }

    private void task2() {
        System.out.println("запускает");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);

            /*if (line.length() > 1) {
                if (emailsAndName.containsKey(line))
                    emailsAndName.put(line.split(" ")[0], line.split(" ")[1]);
            }*/
        }
        sc.close();

        //System.out.println(emailsAndName);
    }

    private void task1() {
        String st = "Current task posted for Java developers developers";
        String[] words = st.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (keyValue.containsKey(words[i])) {
                int count = keyValue.get(words[i]);
                keyValue.put(words[i], count + 1);
            }
            else
                keyValue.put(words[i], 1);
        }

        System.out.println(keyValue);
    }
}
