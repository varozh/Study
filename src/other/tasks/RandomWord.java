package other.tasks;

import lesson21.LabsTwo;

import java.util.*;
import java.util.stream.Collectors;

public class RandomWord {
    private String[] words;
    private String st;

    public RandomWord(String st) {
        words = st.split(" ");
//        shuffle();
        shuffleWithoutLibrary();
        print();
    }

    public void print() {
        System.out.println(st);
    }

    private void shuffle() {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                List<Character> chars = new ArrayList<>();
                for (int j = 0; j < words[i].length(); j++)
                    chars.add(words[i].charAt(j));
                Collections.shuffle(chars);
                words[i] = chars.stream().map(e->e.toString()).collect(Collectors.joining());
            }
        }
        st = String.join(" ", words);
    }

    private void shuffleWithoutLibrary() {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                char[] chars = words[i].toCharArray();
                for (int j = 0; j < chars.length - 1; j++) {
                    int j1 = (int) (Math.random() * (j + 1));
                    char temp = chars[j];
                    chars[j] = chars[j1];
                    chars[j1] = temp;
                }
                words[i] = new String(chars);
            }
        }
        st = String.join(" ", words);
    }
}
