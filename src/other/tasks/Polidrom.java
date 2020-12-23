package other.tasks;

import lesson21.LabsTwo;
import lesson22.LabsThree;

import java.util.Iterator;

public class Polidrom {
    private String st;

    public Polidrom() {
        this.st = LabsTwo.inputString();
    }

    public Polidrom(String st) {
        this.st = st;
    }

    public void run() {
        polidrom();
    }

    private void polidrom() {
        boolean answer = true;
        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(st.length() - i - 1)) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}
