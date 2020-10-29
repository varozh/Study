package other.tasks;

import lesson21.LabsTwo;

public class NumString {
    private String str;
    private int sz;

    public NumString(String str, int sz) {
        this.str = str;
        this.sz = sz;
    }

    public NumString() {
        this.str = LabsTwo.num.nextLine();
        this.sz = LabsTwo.num.nextInt();
    }

    public void run() {
        System.out.println(str);
        String result = "";
        for (int i = 0; i < str.length(); i += sz) {
            String cycle = "";
            if (i + sz < str.length()) cycle = str.substring(i, i + sz);
            else if (i + sz >= str.length()) cycle = str.substring(i, str.length());
            result += creatSubstring(cycle);
        }
        System.out.println(result);
    }

    private String creatSubstring(String cycle) {
        int sumCube = 0;
        String st = "";
        String result = "";
        for (int i = 0; i < cycle.length(); i++)
            sumCube += (int) (Math.pow(Integer.parseInt(String.valueOf(cycle.charAt(i))), 3));
        if (sumCube % 2 == 0) st = creatSubstringOne(cycle);
        else st = creatSubstringTwo(cycle);
        result += st;
        return result;
    }

    private String creatSubstringOne(String cycle) {
        char[] chars = cycle.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        String result = "";
        for (char c: chars)
            result += c;
        return result;
    }

    private String creatSubstringTwo(String cycle) {
        char[] chars = cycle.toCharArray();
        char temp = chars[0];
        for (int i = 0; i < chars.length - 1; i++)
            chars[i] = chars[i + 1];
        chars[chars.length - 1] = temp;
        String result = "";
        for (char c: chars)
            result += c;
        return result;
    }
}
