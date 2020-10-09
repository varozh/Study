package other.tasks;

public class SortSelection {
    private int[] mas;
    private int elem;

    public SortSelection(int n) {
        mas = new int[n];
        elem = 0;
    }

    public void into(int value) {
        mas[elem] = value;
        elem++;
    }

    public void toSwap(int[] mas, int first, int second) {
        int tmp = mas[first];
        mas[first] = mas[second];
        mas[second] = tmp;
    }

    public void sortMas (int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int minValue = mas[i];
            int minIndex = i;
            for(int j = i + 1; j < mas.length; j++) {
                if (mas[j] < minValue) {
                    minValue = mas[j];
                    minIndex = j;
                }
            }
            toSwap(mas, i, minIndex);
        }
    }
}
