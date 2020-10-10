package other.tasks;

import com.sun.tools.javac.Main;

import java.util.Locale;

public class ConverString {
    private String st;

    public void run(String st) {
        st = toSwap(st);
        print(st);
    }

    private String toSwap(String st) {
        String[] chars = {"-", "_"};
        for (String temp : chars)
            st = st.replace(temp, "");

        return st;
    }

    private void print(String st) {
        System.out.println(st);
    }

//    public ConverString(String st) {
//        this.st = st;
//    }
}
