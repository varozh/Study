package OtherTasksMasTwo;

import Lesson19.Labs;

import java.util.Scanner;

public class Tasks {
    public static Scanner num = new Scanner(System.in);
    static Labs l19 = new Labs();

    public static void result() {
        int n = 5, m = 5;
        int[][] mas = new int[n][m];
        random(mas);
        write(mas);
        result11(mas);
    }

    public static void result12(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int x = mas[i][mas.length - 1];
            for (int j = mas[i].length - 1; j > 0; j--)
                mas[i][j] = mas[i][j - 1];
            mas[i][0] = x;
        }
        write(mas);
    }

    public static void result11(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int x = mas[i][0];
            for (int j = 0; j < mas[i].length - 1; j++)
                mas[i][j] = mas[i][j + 1];
            mas[i][mas[i].length - 1] = x;
        }
        write(mas);
    }

    public static void result10(int[][] mas) {
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

    public static void result9(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length - i; j++) {
                int x = mas[i][j];
                mas[i][j] = mas[mas.length - 1 - i][mas[i].length - 1 - j];
                mas[mas.length - 1 - i][mas[i].length - 1 - j] = x;
            }
        }
        write(mas);
    }

    public static void result8(int[][] mas) {
        int x = mas[0][0];
        mas[0][0] = mas[mas.length - 1][mas[0].length - 1];
        mas[mas.length - 1][mas[0].length - 1] = x;
        write(mas);
    }

    public static void result7(int[][] mas) {
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

    public static void result6(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i + j) % 2 == 0 && mas[i][j] % 2 != 0)
                    System.out.print(mas[i][j] + " ");
            }
        }
    }

    public static void result5(int[][] mas) {
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

    public static void result4(int[][] mas) {
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

    public static void result3(int[][] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                sum += mas[i][j];
        }
        int sr = sum / (mas.length * mas[0].length);
        System.out.println(sr);
    }

    public static void result2(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = (int) Math.pow(mas[i][j], 2);
        }
        write(mas);
    }

    public static void result1(int[][] mas) {
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

    public static void random(int[][] mas) {
        int min = 1, max = 15;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
        }
    }

    public static void write(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++)
                System.out.printf("%4d", mas[i][j]);
        }
        System.out.println();
    }
}
