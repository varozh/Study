package other.tasks;

import lesson19.Labs;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapStudy {
    private String pathInWork = "C:\\Users\\buhdeka\\Desktop\\test.txt";
    private String pathInHome = "C:\\Users\\Admin\\Desktop\\1.txt";
    private BufferedReader reader = new BufferedReader(new FileReader(pathInHome));
    private Scanner sc = new Scanner(new File(pathInHome));
    private HashMap <String, Integer> keyValue = new HashMap<String, Integer>();
    private HashMap<String, String> emailsAndName = new HashMap<String, String>();
    private List<String> emails = new ArrayList<>();
    private List<String> name = new ArrayList<>();

    public HashMapStudy() throws FileNotFoundException {
    }

    public void run() {
        task4();
    }

    private void task4() {
        int[] mas = new int[10];
        Labs.masRandom(mas, 1, 99);
        Labs.print(mas);

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for (int i = 0; i < mas.length; i++) {
            while (mas[i] != 0) {
                int x = mas[i] % 10;
                if (numbers.containsKey(x)) {
                    int count = numbers.get(x);
                    numbers.put(x, count + 1);
                }
                else
                    numbers.put(x, 1);
                mas[i] /= 10;
            }
        }

        System.out.println(numbers);
    }

    private void task3() {
        int[] mas = new int[10];
        Labs.masRandom(mas, 1, 99);
        Labs.print(mas);

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for (int i = 0; i < mas.length; i++) {
            if (numbers.containsKey(mas[i])) {
                int count = numbers.get(mas[i]);
                numbers.put(mas[i], count + 1);
            }
            else
                numbers.put(mas[i], 1);
        }

        System.out.println(numbers);
    }

    private void task2() {
        try {
            String line = reader.readLine();
            while (line != null) {
                if (line.length() > 1) {
                    if (!emailsAndName.containsKey(line.split(" ")[0]))
                        emailsAndName.put(line.split(" ")[0], line.substring(line.indexOf(" ") + 1));
                }
                System.out.println(line);

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(emailsAndName);
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
