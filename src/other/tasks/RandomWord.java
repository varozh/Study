package other.tasks;

import lesson21.LabsTwo;

import java.util.*;
import java.util.stream.Collectors;

public class RandomWord {
    private String[] words;
    private String st;

    public RandomWord(String st) {
        words = st.split(" ");
        shuffle();
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
}
