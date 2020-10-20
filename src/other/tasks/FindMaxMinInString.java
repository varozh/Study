package other.tasks;

import lesson19.Labs;
import lesson22.LabsThree;

import java.util.ArrayList;

public class FindMaxMinInString {
    private String st;

    public FindMaxMinInString() {
        LabsThree sc = new LabsThree();
        System.out.print("Введите строку: ");
        st = sc.num.nextLine();
    }

    public FindMaxMinInString(String st) {
        this.st = st;
    }

    public void returnMaxMin() {
        int[] digits = creatMasDigits();
        int min = digits[0], max = digits[0];
        for (int i = 0; i < digits.length; i++) {
            if (max < digits[i])
                max = digits[i];
            if (min > digits[i])
                min = digits[i];
        }
        String text = "";
        for (int i: digits) {
            if (i == max)
                text += i;
        }
        text += " ";
        for (int i: digits) {
            if (i == min)
                text += i;
        }
        System.out.println(text);
    }

    private int[] creatMasDigits() {
        char[] digit = st.toCharArray();
        ArrayList<Integer> digitsList = new ArrayList<>();
        for (int i = 0; i < digit.length; i++) {
            if (Character.isDigit(digit[i]))
                digitsList.add(Integer.parseInt(Character.toString(digit[i])));
        }
        int[] digits = saveDigits(digitsList);
        Labs.outputPrintf(digits);
        return digits;
    }

    private int[] saveDigits(ArrayList digits) {
        int[] digit = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++)
            digit[i] = (int) digits.get(i);
        return digit;
    }
}
