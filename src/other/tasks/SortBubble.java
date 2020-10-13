package other.tasks;

import lesson19.Labs;

public class SortBubble {
    private int[] mas;
    private int elems;

    public SortBubble(int n) {
        mas = new int[n];
        elems = 0;
    }
    public SortBubble() {
    }

    public SortBubble(int[] mas) {
        this.mas = mas;
        bubbleSortMas();
        print();
    }

    public void into(int value) {
        mas[elems] = value;
        elems++;
    }

    public void intoMas(int[] mas) {
        this.mas = mas;
        bubbleSortMas();
        print();
    }

    private void toSwap(int first, int second) {
        int tmp = mas[first];
        mas[first] = mas[second];
        mas[second] = tmp;
    }

    public void bubbleSort() {
        for (int out = elems - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++)
                if (mas[in] > mas[in + 1])
                    toSwap(in, in + 1);
        }
    }

    private void bubbleSortMas() {
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

    public void print() {
        Labs.outputPrintf(mas);
    }
}
