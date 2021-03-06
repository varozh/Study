package other.tasks;

import lesson19.Labs;

public class SortBubble {
    private int[] mas;
    private int[][] masTwo;
    private int elems;

    public SortBubble(int n) {
        mas = new int[n];
        elems = 0;
    }

    public SortBubble() {
    }

    public SortBubble(int[] mas) {
        this.mas = mas;
    }

    public SortBubble(int[][] mas) {
        this.masTwo = mas;
    }

    public void into(int value) {
        mas[elems] = value;
        elems++;
    }

    private void toSwap(int first, int second) {
        int tmp = mas[first];
        mas[first] = mas[second];
        mas[second] = tmp;
    }

    public void bubbleSort() {
        for (int out = elems - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++)
                if (mas[in] < mas[in + 1])
                    toSwap(in, in + 1);
        }
    }

    public void bubbleSortMas() {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    toSwap(i, i + 1);
                    flag = false;
                }
            }
        }
    }

    private void toSwapTwo(int i1, int j1 , int i2, int j2) {
        int tmp = masTwo[i1][j1];
        masTwo[i1][j1] = masTwo[i2][j2];
        masTwo[i2][j2] = tmp;
    }

    public void bubbleSortMasTwoByColumn() {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int j = 0; j < masTwo[0].length; j++) {
                for (int i = 0; i < masTwo.length - 1; i++) {
                    if (masTwo[i][j] < masTwo[i + 1][j]) {
                        toSwapTwo(i, j, i + 1 , j);
                        flag = false;
                    }
                }
            }
        }
    }

    public void print() {
        Labs.outputPrintf(mas);
    }

    public int[] returnMas() {
        return mas;
    }

    public void printTwo() {
        Tasks tak = new Tasks();
        tak.write(masTwo);
    }
}
