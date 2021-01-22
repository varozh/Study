package testJunior;

import lesson19.Labs;

public class Others {
    private String st = "The quick brown fox jumps over the lazy dog.";

    public Others() {

    }

    public Others(String st) {
        this.st = st;
    }

    public void run() {
        sortMass();
    }

    private void sortMass() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        Labs.print(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) continue;

            int temp = array[i];
            int minSize = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] % 2 == 0) continue;

                if(array[i] > array[j]) {
                    minSize = array[j];
                    minIndex = j;
                }
            }
            array[i] = minSize;
            array[minIndex] = temp;
        }

        Labs.print(array);
    }

    private void next5() {
        System.out.print("Введите х: ");
        int x = Labs.num.nextInt();
        int y = 0;

        if (x % 5 == 0) y = x;
        else {
            for (int i = x + 1; i <= x + 4; i++) {
                if (i % 5 == 0) {
                    y = i;
                    break;
                }
            }
        }

        System.out.println("y = " + y);
    }

    private void reverseWords() {
        String reverse = "";

        for (String str: st.split(" ")) {
            StringBuilder s = new StringBuilder(str);

            for (int i = 0; i < s.length() / 2; i++) {
                char ch = s.charAt(i);

                s.setCharAt(i, s.charAt(s.length() - i - 1));
                s.setCharAt(s.length() - i - 1, ch);
            }
            reverse += s + " ";
        }
        reverse = reverse.substring(0, reverse.length() - 1);

        System.out.println(reverse);
    }
}
