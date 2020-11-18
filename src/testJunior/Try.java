package testJunior;

import lesson22.LabsThree;

import java.util.ArrayList;

public class Try {
    private String str;
    LabsThree vvod = new LabsThree();

    public void stringReverse() {
        System.out.println("Введите строку: ");
        this.str = vvod.num.nextLine();

        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println(buffer);

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        System.out.println(result);
    }

    public void polidrom() {
        System.out.print("Введите число: ");
        int x = vvod.num.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;
        }
        int count = 0;
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) == list.get(list.size() - 1 - i))
                count++;
        }
        boolean flag = (count == list.size() / 2);
        System.out.println(flag);
    }
}
