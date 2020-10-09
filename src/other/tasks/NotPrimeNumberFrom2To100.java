package other.tasks;

import lesson19.Labs;

public class NotPrimeNumberFrom2To100 {
    private int count = countNotPrimeNumbers();
    private int[][] mas = new int[count][];
    Tasks tak = new Tasks();

    public void run() {
        resultOne(mas);
        resultTwo(mas);
        tak.write(mas);
    }

    private void resultOne(int[][] mas) {
        int i = 0;
        for (int g = 2; g < 100; g++) {
            int count = 0;
            for (int k = 1; k <= g; k++) {
                if (g % k == 0)
                    count++;
            }
            if (count > 2) {
                mas[i] = new int[count + 1];
                mas[i][0] = g;
                i++;
            }
        }
    }

    private void resultTwo(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int j = 1;
            for (int k = 1; k <= mas[i][0]; k++) {
                if(mas[i][0] % k == 0) {
                    mas[i][j] = k;
                    j++;
                }
            }
        }
    }

    private int countNotPrimeNumbers() {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            int countNotPrimeNumbers = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    countNotPrimeNumbers++;
            }
            if (countNotPrimeNumbers > 2)
                count++;
        }
        return count;
    }
}
