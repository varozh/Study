package other.tasks;

import lesson19.Labs;
import lesson21.LabsTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleInTheBus {
    private int passager = 0;

    public void into(ArrayList<int[]> stops) {
        for (int i = 0; i < stops.size(); i++) {
            int[] x = stops.get(i);
            passager += x[0];
            passager -= x[1];
        }
    }

    public void binaryArrayToNumber(List<Integer> binary) {
        String str = "";
        for (int i = 0; i < binary.size(); i++) {
            str += String.valueOf(binary.get(i));
        }
        System.out.println(str);
        int x = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2)
            x += (str.charAt(i) - '0') * j;
        System.out.println(x);
    }
}
