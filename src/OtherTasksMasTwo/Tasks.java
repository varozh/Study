package OtherTasksMasTwo;

import java.util.Scanner;

public class Tasks {
    public static Scanner num = new Scanner(System.in);

    public static void main() {
        int n = 10, m = 10;
        int[][] mas = new int[n][m];
        random(mas);
        write(mas);
        result5(mas);
    }

    public static void result5(int[][] mas) {
        int i = 0;
        while ((int) Math.pow(2, i) < mas.length) {
            int j = 0;
            while ((int) Math.pow(2, j) < mas[0].length) {
                System.out.print(mas[(int) Math.pow(2, i)][(int) Math.pow(2, j)] + " ");
//                System.out.print("[" + (int) Math.pow(2, i) + "." + (int) Math.pow(2, j) + "] ");
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
        int min = 1, max = 25;
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
