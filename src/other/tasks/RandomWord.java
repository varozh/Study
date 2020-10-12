package other.tasks;

import lesson21.LabsTwo;

public class RandomWord {
    private String st;
    private String[] words = st.split(" ");

    public RandomWord(String st) {
        this.st = st;
    }

    public void print() {
        LabsTwo.outputStringMas(words);
    }

    private void defineWord() {
        for (String word: words)
            if (word.length() >= 3)
                System.out.println(word);
    }
}
