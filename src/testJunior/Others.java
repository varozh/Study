package testJunior;

import lesson19.Labs;

public class Others {
    private String st;

    public Others() {

    }

    public Others(String st) {
        this.st = st;
    }

    public void run() {
        oddOrEven();
    }

    private void oddOrEven() {
        int[] array = {2, 5, 34, 6};
        int sum = 0;

        for (int i: array)
            sum += i;

        System.out.println(resultOddOrEven(sum));
    }

    private static String resultOddOrEven(int x) {
        String st;
        if (x % 2 == 0)
            st = "even";
        else
            st = "odd";
        return st;
    }

    private void mostDigits() {
        int[] numbers = {1, 10, 100};
        int max = 0, index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = numberOfDigits(numbers[i]);
            if (max < count) {
                max = count;
                index = i;
            }
        }
    }

    private static int numberOfDigits(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }

    private void squareNumber() {
        int x = 9119;
        String number = String.valueOf(x);
        String result = "";

        for (int i = 0; i < number.length(); i++) {
            int y = (int) Math.pow(Integer.parseInt(String.valueOf(number.charAt(i))), 2);
            result += y;
        }
        int y = Integer.parseInt(result);
        System.out.println(y);
    }

    private void fixStringCase() {
        st = "cODE";
        int upperCase = 0, lowerCase = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isUpperCase(st.charAt(i))) upperCase++;
            if (Character.isLowerCase(st.charAt(i))) lowerCase++;
        }

        if (upperCase <= lowerCase)
            st = st.toLowerCase();
        else
            st = st.toUpperCase();

        System.out.println(st);
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
        st = "The quick brown fox jumps over the lazy dog.";

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
