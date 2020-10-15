package other.tasks;

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
        char[] chars = st.toCharArray();
        int[] countChars = new int[st.length()];

        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j))
                    countChars[i]++;
            }
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j))
                    System.out.print(st.charAt(i) + "" + i + " ");
            }
        }
        System.out.println();

//        for (int i = 0; i < chars.length; i++) {
//            for (int j = i + 1; j < chars.length; j++) {
//                if (chars[i] == chars[j])
//                    countChars[i]++;
//            }
//            for (int j = i + 1; j < chars.length; j++) {
//                if (chars[i] == chars[j])
//                    countChars[j] = 0;
//            }
//        }
        for (int i = 0; i < countChars.length; i++)
            System.out.print(countChars[i] + " ");
    }

    public void print() {
        System.out.println(count);
    }
}
