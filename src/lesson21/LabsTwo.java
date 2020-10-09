package lesson21;

import java.util.ArrayList;

import java.util.Scanner;

public class LabsTwo {
    public static Scanner num = new Scanner(System.in);
    public static String st;

    public void test2124() {
        String[] str = new String[sizeStringMas()];
        num.nextLine();
        inputStringMas(str);
        int maxIndex = 0, max = 0;
        String maxString = null;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (Character.isUpperCase(str[i].charAt(j)))
                    count++;
            }
            if (count > max) {
                max = count;
                maxString = str[i];
                maxIndex = i + 1;
            }
            System.out.println(count);
        }
        System.out.println("Больше всего заглавных букв в строке - " + maxString + ", номер строки - " + maxIndex);
    }

    public void test2123() {
        String[] str = new String[sizeStringMas()];
        num.nextLine();
        inputStringMas(str);
        int max = 0, maxIndex = 0;
        String maxString = null;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].length() > max) {
                    max = str[i].length();
                    maxString = str[i];
                    maxIndex = i + 1;
                }
            }
        }
        System.out.println("Самая длинная строка - " + maxString + ", номер строки - " + maxIndex);
    }

    public void test2122() {
        String[] str1 = new String[2];
        inputStringMas(str1);
        System.out.println("Результат первого теста: " + result21221(str1));
        String[] str2 = new String[sizeStringMas()];
        num.nextLine();
        inputStringMas(str2);
        System.out.println("Результат второго теста: " + result21222(str2));
    }
    public boolean result21221(String[] str) {
        boolean flag = false;
        for (int i = 0; i < str.length; i++) {
            if (str[0].charAt(str[0].length() - 1) == str[1].charAt(0))
                flag = true;
        }
        return flag;
    }
    public boolean result21222(String[] str) {
        boolean flag = true;
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].charAt(str[i].length() - 1) != str[i + 1].charAt(0))
                flag = false;
            if (!flag)
                break;
        }
        return flag;
    }


    public void test2121() {
        st = inputString();
        int count = 0;
        while (!st.equals("stop")) {
            if (result2121(st))
                count++;
            st = inputString();
        }
        System.out.println(count);
    }
    public boolean result2121(String st) {
        boolean flag = true;
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (st.charAt(i)==st.charAt(j))
                    return false;
            }
        }
        return flag;
    }

    public void test2120() {
        String[] str = new String[sizeStringMas()];
        num.nextLine();
        inputStringMas(str);
        outputStringMas(str);
        result2120(str);
        st = inputString();
        char[] chars = st.toCharArray();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < st.length(); j++) {
                if (chars[i] == chars[j])
                    count++;
            }
            if (count <= 1)
                System.out.print(st.charAt(i));
            else
                count = 0;
        }
    }
    public void result2120(String[] str) {
        for (int i = 0; i < str.length; i++) {
            char[] chars = str[i].toCharArray();
            for (int i1 = 0; i1 < str[i].length(); i1++) {
                int count = 0;
                for (int j1 = 0; j1 < str[i].length(); j1++) {
                    if (chars[i1] == chars[j1])
                        count++;
                }
                if (count > 1) {
                    String copy = str[i].replaceAll(String.valueOf(chars[i1]), "");
                    str[i] = copy;
                }
                else
                    count = 0;
            }
        }
        outputStringMas(str);
        count2120(str);
    }
    public void count2120(String[] str) {
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max)
                max = str[i].length();
        }
        System.out.print("Самый длинные элемент массива, после его обновления - ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == max)
                System.out.print(str[i] + ", № - " + (i + 1));
        }
        System.out.println();
    }

    public void test2119() {
        System.out.print("Введите строку: ");
        st = num.nextLine();
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {

        }
//        System.out.println(sum);
    }

    public void test2118() {
        System.out.print("Введите строку: ");
        st = num.nextLine();
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.getNumericValue(st.charAt(i)) >= 0) {
                int x = Character.getNumericValue(st.charAt(i));
                sum += x;
            }
        }
        System.out.println(sum);
    }

    public void test2117() {
        System.out.print("Введите символ цифры:");
        String x = num.next();
        try {
            int y = Integer.parseInt(x);
            System.out.println(y);
        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат строки!");
        }
    }

    public void test2116() {
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        System.out.print("Вводи значение: ");
        while (flag) {
            st = num.nextLine();
            if (st.equals("финал"))
                flag = false;
            else {
                list.add(st);
                System.out.print("Вводи еще: ");
            }
        }
        System.out.println(list);
        int count = 0;
        Object[] str = list.toArray();
        for (int i = 0; i < str.length; i++) {
            int firstChar = 0, lastChar = str[i].toString().length() - 1;
            boolean flagTwo = true;
            while (flagTwo && firstChar < lastChar) {
                if (str[i].toString().charAt(firstChar) != str[i].toString().charAt(lastChar))
                    flagTwo = false;
                firstChar++;
                lastChar--;
            }
            if (flagTwo)
                count++;
        }
        System.out.println(count);

    }

    public void test2115() {
        st = inputString();
        System.out.println(result2115(st));
    }
    public boolean result2115(String st){
        int firstChar = 0, lastChar = st.length() - 1;
        boolean flag = true;
        while (flag && firstChar < lastChar) {
            if (st.charAt(firstChar) != st.charAt(lastChar))
                flag = false;
            firstChar++;
            lastChar--;
        }
        return flag;
    }

    public void test2114() {
        st = inputString();
//        for (int i = st.length() - 1; i >= 0; i--) {
//            System.out.print(st.charAt(i));
//        }
//        System.out.println(new StringBuilder(st).reverse().toString());
    }

    public void test2113() {
        String[] alphabet = new String[33];
        for (int i = 128; i < 160; i++) {
            alphabet[i - 128] = Character.toString((char) i);
            System.out.print(alphabet[i - 128] + " ");
        }
        System.out.println();
//        outputStringMas(alphabet);
        st = inputString();
        for (int i = 0; i < st.length(); i++) {
            if (Character.toString(st.charAt(i)).matches("[А-Я]"))
                System.out.print(st.charAt(i));
        }
    }

    public static void test2112() {
        System.out.print("??????? ????????? ????????: ");
        st = num.nextLine();
        System.out.print("??????? ?????????? ????????: ");
        char ch = num.next().charAt(0);
        result21121(st, ch);
        int n = sizeStringMas();
        String[] name = new String[n];
        String[] surname = new String[n];
        num.nextLine();
        inputNameAndSurname(name, surname);
        outputNameAndSurname(name, surname);
        result21122(name, surname);
    }
    public static void result21121(String st, char ch) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (ch == st.charAt(i))
                count++;
        }
        System.out.println(count);
    }
    public static void result21122(String[] name, String[] surname) {
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            name[i] = name[i].toLowerCase();
            surname[i] = surname[i].toLowerCase();
            int k = 0;
            for (int j = 0; j < surname[i].length(); j++) {
                if (name[i].charAt(0) == surname[i].charAt(j))
                    k++;
            }
            if (k > 1)
                count++;
        }
        System.out.println(count);
    }

    public static void test2111() {
        System.out.print("??????? ??????? ????????: ");
        st = num.next();
        if (st.charAt(0) == st.charAt(st.length() - 1))
            System.out.println("??");
        else
            System.out.println("???");
    }

    public static void test2110() {
        System.out.print("??????? ???: ");
        String name = num.next();
        System.out.print("??????? ???????: ");
        String surname = num.next();
        if (name.charAt(0) == surname.charAt(0))
            System.out.println("??");
        else
            System.out.println("???");
    }

    public static void test2109() {
        String[] str = new String[2];
        inputStringMas(str);
        outputStringMas(str);
        if (str[0].length() > str[1].length())
            System.out.println("??????");
        else if (str[0].length() < str[1].length())
            System.out.println("??????");
        else
            System.out.println("?????");
    }

    public static void test2108() {
        String st1 = num.nextLine();
        String st2 = num.nextLine();
        st1 = st1.substring(0 , 1).toUpperCase() + st1.substring(1).toLowerCase();
        st2 = st2.substring(0 , 1).toUpperCase() + st2.substring(1).toLowerCase();
        System.out.println(st1 + ", " + st2);
        if (st1.equals(st2))
            System.out.println("?????");
        else
            System.out.println("???");
    }

    public static void test2107() {
        String[] str = new String[sizeStringMas()];
        num.nextLine();
        inputStringMas(str);
        outputStringMas(str);
        result2107(str);
    }
    public static void result2107(String[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(0) == '?' || str[i].charAt(0) == '?')
                count++;
        }
        System.out.println(count);
    }

    public static void test2106() {
        st = inputString();
        result2106(st);
    }
    public static void result2106(String st) {
        for (int i = 0; i < st.length(); i++) {
            System.out.println();
            for (int j = 0; j < i + 1; j++)
                System.out.print(st.charAt(0));
        }
    }

    public static void test2105() {
        String st = inputString();
        result2105(st);
    }
    public static void result2105(String st) {
        for (int i = 0; i < st.length(); i++)
            System.out.print(st.charAt(i) + " ");
    }

    public static void test2104() {
        String st = inputString();
        result2104(st);
    }
    public static void result2104(String st) {
        for (int i = 0; i < st.length(); i++)
            System.out.println(st.charAt(i));
    }

    public static void test2103() {
        st = inputString();
        result2103(st);
    }
    public static void result2103(String st) {
        int n = st.length();
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(n - 1));
    }


    public static String inputString() {
        System.out.print("Введите строку: ");
        String st = num.nextLine();
        return st;
    }

    public static int sizeStringMas() {
        System.out.print("Введите размер массива: ");
        int n = num.nextInt();
        return n;
    }

    public static void inputStringMas(String[] st) {
        for (int i = 0; i < st.length; i++) {
            System.out.print("Введите " + (i + 1) + " элемент: ");
            st[i] = num.nextLine();
        }
        System.out.println();
    }

    public static void outputStringMas(String[] st) {
        for (int i = 0; i < st.length; i++) {
            if (i < st.length - 1)
                System.out.print(st[i] + ", ");
            else if (i == st.length - 1)
                System.out.print(st[i] + ".");
        }
        System.out.println();
    }

    public static void inputNameAndSurname(String[] name, String[] surname) {
        for (int i = 0; i < name.length; i++) {
            System.out.print("Введите имя: ");
            name[i] = num.nextLine();
            System.out.print("Введите фамилию: ");
            surname[i] = num.nextLine();
        }
    }

    public static void outputNameAndSurname(String[] name, String[] surname) {
        for (int i = 0; i < name.length; i++) {
                if (i < name.length - 1)
                    System.out.print(name[i] + " " + surname[i] + ", ");
                else if (i == name.length - 1)
                    System.out.print(name[i] + " " + surname[i] + ".");
        }
        System.out.println();
    }
}
