package other.tasks;

import lesson19.Labs;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public Scanner num = new Scanner(System.in);
    public Labs l19 = new Labs();
    private int[][] mas;

    public void task() {
//        task8();
        creatMas5();
    }

    public void task9() {
        mas = new int[10][10];
    }

    public void creatMas5() {
        int n = Labs.masSize();
        mas = new int[n][n];
        for (int i = 0; i < mas.length; i++) {
            int value = 2;
            int i1;
            if (i == 0)
                i1 = 0;
            else
                i1 = i - 1;
            for (int j = i1; j >= 0; j--) {
                mas[i][j] = value;
                value++;
            }
            value = 1;
            for (int j = i; j < mas[i].length; j++) {
                mas[i][j] = value;
                value++;
            }
        }
        Labs.outputMasTwo(mas);
    }

    public void removeElem(int[] mas) {
        int offset = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0)
                offset++;
            else
                mas[i - offset] = mas[i];
        }
        Arrays.copyOf(mas, mas.length - offset);
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    public void creatMas4() {
        int n = Labs.masSize();
        mas = new int[n][n];
        int value = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = value;
                value++;
                if ((i + j) % 2 == 1)
                    mas[i][j] *= -1;
            }
        }
        Labs.outputMasTwo(mas);
    }

    public void creatMas3() {
        int n = Labs.masSize();
        int m = Labs.masSize();
        mas = new int[n][m];
        int value = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = value;
                value++;
            }
        }
        Labs.outputMasTwo(mas);
    }

    public void creatMas2() {
        int n = Labs.masSize();
        int m = Labs.masSize();
        mas = new int[n][m];
        int value;
        for (int i = 0; i < mas.length; i++) {
            value = mas[0].length * (i + 1);
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = value;
                value--;
            }
        }
        Labs.outputMasTwo(mas);
    }
    
    public void creatMas1() {
        int n = Labs.masSize();
        int m = Labs.masSize();
        mas = new int[n][m];
        int value = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = value;
                value++;
            }
        }
        Labs.outputMasTwo(mas);
    }

    public void task8() {
        mas = inputMasSize();
        random(mas);
        write(mas);
        int maxElem = 0;
        for (int j = 0; j < mas[0].length; j++) {
            int minElem = mas[0][j];
            for (int i = 0; i < mas.length; i++)
                if (mas[i][j] < minElem)
                    minElem = mas[i][j];
            if (minElem > maxElem)
                maxElem = minElem;
        }
        System.out.println();
        System.out.println(maxElem);
    }

    public void task7() {
        mas = inputMasSize();
        random(mas);
        write(mas);
        int max = 0;
        int maxIndex = 0;
        for (int j = 0; j < mas[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < mas.length; i++)
                sum += mas[i][j];
            if (sum > max) {
                max = sum;
                maxIndex = j + 1;
            }
        }
        System.out.println("Наиб сумма в " + maxIndex + " столбце");
    }

    public void task6() {
        mas = inputMasSize();
        random(mas);
        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            System.out.println();
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[i][j];
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.printf("%4d", sum);
        }
        System.out.println();
        for (int j = 0; j < mas[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < mas.length; i++) {
                sum += mas[i][j];
            }
            System.out.printf("%4d", sum);
        }
    }

    public int[][] inputMasSize() {
        int n = Labs.masSize();
        int m = Labs.masSize();
        mas = new int[n][m];
        return mas;
    }

    public void task5() {
        int n = Labs.masSize();
        int m = Labs.masSize();
        int[][] ar1 = new int[n][m];
        int[][] ar2 = new int[n][m];
        random(ar1);
        random(ar2);
        write(ar1);
        write(ar2);
        int[][] ar3 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ar1[i][j] >= ar2[i][j])
                    ar3[i][j] = ar1[i][j];
                else
                    ar3[i][j] = ar2[i][j];
            }
        }
        write(ar3);
    }

    public void task4() {
        int n = Labs.masSize();
        int m = Labs.masSize();
        mas = new int[n][m];
        random(mas);
        write(mas);
        int[] ar = new int[m];
        int k = Labs.inputOne() - 1;
        for (int j = 0; j < mas[k].length; j++)
            ar[j] = mas[k][j];
        Labs.outputPrintf(ar);
    }

    public void task3() {
        int n = Labs.masSize();
        int m = Labs.masSize();
        mas = new int[n][m];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                if (i == 0 || j == 0)
                    mas[i][j] = (int) Math.sin(n * (i + 1) + m * (j + 1));
                else
                    mas[i][j] = (int) Math.sin(n * i + m * j);
        }
        for (int[] i: mas) {
            for (int j: i)
                if (j <= 0)
                    j = 0;
        }
        write(mas);
    }

    public void task1() {
        int n = Labs.masSize();
        mas = new int[n][n];
        l19.random(mas, -15, 15);
        write(mas);
        for (int i = 0; i < mas.length; i++)
            if (mas[i][i] >= 0)
                System.out.print(mas[i][i] + " ");
    }

    public void solutionMas() {
        mas = new int[3][3];
        int value = 1;
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = value;
                value++;
            }
        }
        Labs.outputMasTwo(mas);
    }

    public void result() {
        int n = 5, m = 5;
        int[][] mas = new int[n][m];
        random(mas);
        write(mas);
        result11(mas);
    }

    public void result12(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int x = mas[i][mas.length - 1];
            for (int j = mas[i].length - 1; j > 0; j--)
                mas[i][j] = mas[i][j - 1];
            mas[i][0] = x;
        }
        write(mas);
    }

    public void result11(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int x = mas[i][0];
            for (int j = 0; j < mas[i].length - 1; j++)
                mas[i][j] = mas[i][j + 1];
            mas[i][mas[i].length - 1] = x;
        }
        write(mas);
    }

    public void result10(int[][] mas) {
        int[] fibo = new int[10];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        l19.outputPrintf(fibo);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for(int g = 0; g < fibo.length; g++) {
                    if (mas[i][j] == fibo[g])
                        System.out.print("[" + i + "." + j + "] ");
                }
            }
        }
    }

    public void result9(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length - i; j++) {
                int x = mas[i][j];
                mas[i][j] = mas[mas.length - 1 - i][mas[i].length - 1 - j];
                mas[mas.length - 1 - i][mas[i].length - 1 - j] = x;
            }
        }
        write(mas);
    }

    public void result8(int[][] mas) {
        int x = mas[0][0];
        mas[0][0] = mas[mas.length - 1][mas[0].length - 1];
        mas[mas.length - 1][mas[0].length - 1] = x;
        write(mas);
    }

    public void result7(int[][] mas) {
        int min = mas[0][0];
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > max)
                    max = mas[i][j];
                if (mas[i][j] < min)
                    min = mas[i][j];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == max)
                    mas[i][j] = min;
                else if (mas[i][j] == min)
                    mas[i][j] = max;
            }
        }

    }

    public void result6(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i + j) % 2 == 0 && mas[i][j] % 2 != 0)
                    System.out.print(mas[i][j] + " ");
            }
        }
    }

    public void result5(int[][] mas) {
        int i = 0;
        while ((int) Math.pow(2, i) < mas.length) {
            int j = 0;
            while ((int) Math.pow(2, j) < mas[i].length) {
                System.out.print(mas[(int) Math.pow(2, i)][(int) Math.pow(2, j)] + " ");
                j++;
            }
            i++;
        }
    }

    public void result4(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int countPlus = 0, countMinus = 0;
            for (int j = 0; j < mas[i].length - 1; j++) {
                if (mas[i][j] < mas[i][j + 1])
                    countMinus++;
                if (mas[i][j] > mas[i][j + 1])
                    countPlus++;
            }
            if (countPlus == mas[0].length - 1)
                System.out.println((i + 1) + " строчка возрастающая");
            if (countMinus == mas[0].length - 1)
                System.out.println((i + 1) + " строчка убывающая");
        }
    }

    public void result3(int[][] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                sum += mas[i][j];
        }
        int sr = sum / (mas.length * mas[0].length);
        System.out.println(sr);
    }

    public void result2(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = (int) Math.pow(mas[i][j], 2);
        }
        write(mas);
    }

    public void result1(int[][] mas) {
        int min = mas[0][0], max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (min > mas[i][j])
                    min = mas[i][j];
                if (max < mas[i][j])
                    max = mas[i][j];
            }
        }
        System.out.println("\tМин = " + min + ",макс = " + max);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == max)
                    mas[i][j] = min;
                else if (mas[i][j] == min)
                    mas[i][j] = max;
            }
        }
        write(mas);
    }

    public void random(int[][] mas) {
        int min = 1, max = 15;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
        }
    }

    public void write(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++)
                System.out.printf("%4d", mas[i][j]);
        }
        System.out.println();
    }
}
