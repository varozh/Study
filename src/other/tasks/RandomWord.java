package other.tasks;

import lesson21.LabsTwo;

import java.util.Arrays;

public class RandomWord {
    private String[] words;
    private String st;

    public RandomWord(String st) {
        words = st.split(" ");
        defineWord();
        print();
    }

    public void print() {
        System.out.println(st);
    }

    private void defineWord() {
        String s;
        for (String word: words)
            if (word.length() >= 5) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    int randomIndex = (int) (Math.random() * chars.length);
                    char temp = chars[i];
                    chars[i] = chars[randomIndex];
                    chars[randomIndex] = temp;
                }
                new String(chars);
            }
    }
}
