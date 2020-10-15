package other.tasks;

import java.util.ArrayList;
import java.util.List;

public class DublecateCount {
    private String st;
    private int count = 0;

    public DublecateCount() {
        Tasks tak = new Tasks();
        System.out.print("Введите строку: ");
        String st = tak.num.next();
        this.st = st;
    }

    public DublecateCount(String st) {
        this.st = st;
    }

    public void run() {
        st = st.toLowerCase();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < st.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < chars.size(); j++) {
                if (st.charAt(i) == chars.get(j))
                    flag = false;
            }
            if (flag) {
                int count = 0;
                for (int j = i + 1; j < st.length(); j++) {
                    if (st.charAt(i) == st.charAt(j))
                        count++;
                }
                if (count >= 1)
                    chars.add(st.charAt(i));
            }
        }
        System.out.println(chars);
        count = chars.size();
    }

    public void print() {
        System.out.println(count);
    }
}
