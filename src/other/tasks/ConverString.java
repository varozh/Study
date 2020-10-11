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
        char[] chars = st.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '-' || chars[i] == '_')
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
        }
        String s = new String(chars);
        String[] badChars = {"-", "_"};
        for (String temp : badChars)
            s = s.replace(temp, "");
        return s;
    }

    private void print(String st) {
        System.out.println(st);
    }

//    public ConverString(String st) {
//        this.st = st;
//    }
}
