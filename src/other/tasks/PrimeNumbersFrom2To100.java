package other.tasks;

import lesson19.Labs;

public class PrimeNumbersFrom2To100 {
    private int count = primeNumbers();
    private int[][] mas = new int[count][];

    public void run() {
        resultOne(mas);
        resultTwo(mas);
        Labs.outputMasTwo(mas);
    }

    private void resultOne(int[][] mas) {
        int i = 0;
        for (int g = 2; g < 100; g++) {
            int count = 0;
            for (int k = 1; k <= g; k++) {
                if (g % k == 0)
                    count++;
            }
            if (count == 2) {
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
                if (mas[i][0] % k == 0) {
                    mas[i][j] = k;
                    j++;
                }
            }
        }

    }

    private int primeNumbers() {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            int countPrimeNumbers = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    countPrimeNumbers++;
            }
            if (countPrimeNumbers == 2)
                count++;
        }
        return count;
    }

}


