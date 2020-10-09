package other.tasks;

import lesson19.Labs;

public class PrimeNumbersFrom2To100 {
    private int count = primeNumbers();
    private int[][] mas = new int[count][];

    public void run() {
        result(mas);
        Labs.outputMasTwo(mas);
    }

    private void result(int[][] mas) {
        int i = 0;
        for (int g = 2; g < 100; g++) {
            int count = 0;
            for (int k = 1; k <= g; k++) {
                if (g % k == 0)
                    count++;
            }
            if (count == 2) {
                mas[i] = new int[count + 1];
                mas[i][0] = i;
            }
            int j = 1;
            for (int k = 1; k <= g; k++) {
                if (g % k == 0) {
                    mas[i][j] = k;
                    j++;
                }
            }
            i++;
        }
    }

    /*
    for (int i = 0; i < masOne.length; i++) {
            count = 0;
            for (int k = 1; k <= masOne[i]; k++) {
                if (masOne[i] % k == 0)
                    count++;
            }
            mas[i] = new int[count + 1];
            mas[i][0] = masOne[i];
            int j = 1;
            for (int k = 1; k <= masOne[i]; k++) {
                if (masOne[i] % k == 0) {
                    mas[i][j] = k;
                    j++;
                }
            }
        }
     */

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


