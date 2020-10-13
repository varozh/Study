package other.tasks;

public class SortBubble {
    private int[] mas;
    private int elems;

    public SortBubble(int n) {
        mas = new int[n];
        elems = 0;
    }
    public SortBubble() {
    }

    public void sortMas(int[] mas) {
        this.mas = mas;
        bubbleSortMas();

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
                if (mas[in] > mas[in + 1])
                    toSwap(in, in + 1);
        }
    }

    private void bubbleSortMas() {
        for (int i = 0;  i > mas.length; i++) {
            for (int j = 0; j < i; j++)
                if (mas[j] > mas[j+ 1])
                    toSwap(j, j + 1);
        }
    }

    public int[] returnMas() {
        return mas;
    }



    public void print() {
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }
}
