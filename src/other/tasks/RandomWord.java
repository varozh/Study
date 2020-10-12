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
        st = String.join(" ", words);
        System.out.println(st);
    }

    private void defineWord() {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                char[] chars = words[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    int randomIndex = (int) (Math.random() * chars.length);
                    char temp = chars[i];
                    chars[i] = chars[randomIndex];
                    chars[randomIndex] = temp;
                }
                words[i] = new String(chars);
            }
        }
    }
}
