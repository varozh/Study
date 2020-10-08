package Lesson22;

import OtherTasksMasTwo.Tasks;
import Lesson19.Labs;


import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class LabsThree {
    Tasks tak = new Tasks();
    Labs l19 = new Labs();
    public static Scanner num = new Scanner(System.in);
    public static int min = 1, max = 25, n = 7, m = 5;
    public static int[][] mas;

    public void test2222() {
        int[] masOne = new int[n];
        l19.masRandom(masOne, min, max);
        l19.outputPrintf(masOne);
        int[][] masTwo = result2222(masOne);
        tak.write(masTwo);
    }
    public int[][] result2222(int[] masOne) {
        int count;
        int[][] mas = new int[masOne.length][];
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
        return mas;
    }

    public void test2221() {
        int[][] mas = new int[n][m];
        tak.random(mas);
        tak.write(mas);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int count = 0;
                max = mas[i][j];
                for (int g = 1; g <= max; g++) {
                    if (mas[i][j] % g == 0)
                        count++;
                }
                mas[i][j] = count;
                count = 0;
            }
        }
        tak.write(mas);
    }

    public void test2220() {
        int[][] mas = new int[n][n];
        tak.random(mas);
        tak.write(mas);
        int sum = 0;
        for (int i = 1; i < mas.length; i++)
            sum += mas[i - 1][i];
        System.out.println(sum);
    }

    public void test2219() {
        int[][] mas = new int[n][n];
        tak.random(mas);
        tak.write(mas);
        int sum = 0;
        for (int i = 0; i < mas.length; i++)
            sum += mas[i][i];
        System.out.println(sum);
    }

    public void test2218() {
        int[][] mas = new int[n][m];
        tak.random(mas);
        tak.write(mas);
        min = mas[0][0];
        min = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > max)
                    max = mas[i][j];
                if (mas[i][j] < min)
                    min = mas[i][j];
            }
        }
        System.out.println("Min = " + min + ", max = " + max);
        System.out.println("Максимальные элементы: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == max)
                    System.out.print("[" + i + "." + j + "] ");
            }
        }
        System.out.println();
        System.out.println("Минимальные элементы: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == min)
                    System.out.print("[" + i + "." + j + "] ");
            }
        }
    }

    public void test2217() {
        tak.random(mas);
        tak.write(mas);
        max = mas[0][0];
        min = mas[0][0];
        int countMin = 0, countMax = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > max)
                    max = mas[i][j];
                if (mas[i][j] < min)
                    min = mas[i][j];
            }
        }
        for (int[] i: mas) {
            for (int j: i) {
                if (j == max)
                    countMax++;
                if(j == min)
                    countMin++;
            }
        }
        System.out.println("min = " + min + ", max = " + max);
        System.out.println("min шт = " + countMin + ", max шт = " + countMax);
    }

    public void test2215() {
        System.out.print("Введите k = ");
        int k = num.nextInt();
        tak.random(mas);
        tak.write(mas);
        int[] output = result2215(mas, k);
        System.out.println();
        l19.outputPrintf(output);
    }
    public int[] result2215(int[][] mas, int k) {
        int count = 0;
        for (int j = 0; j < mas[0].length; j++) {
            if (mas[k][j] % 2 == 0)
                count++;
        }
        int[] value = new int[count];
        int i = 0;
        for (int j = 0; j < mas[0].length; j++) {
            if (mas[k][j] % 2 == 0) {
                value[i] = mas[k][j];
                i++;
            }
        }
        return value;
    }

    public void test2214() {
        int[][] mas = new int[n][m];
        random(mas, min, max);
        outputMasInt(mas);
        System.out.println(Arrays.toString(result2214(mas)));
    }
    public int[] result2214(int[][] mas) {
        int[] sum = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                sum[i] += mas[i][j];
        }
        return sum;
    }

    public void test2213() {
        int[][] mas = new int[n][m];
        System.out.println(result2213(mas));
        outputMasInt(mas);
    }
    public int result2213(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++)
                mas[i][j] = 0;
        }
        int count = 0, sumOne, sumTwo;
        boolean flag = false;
        do {
            sumOne = 0;
            sumTwo = 0;
            random(mas, min, max);
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[0].length; j++) {
                    if ((i == 0 || i == mas.length - 1) || (j == 0 || j == mas[0].length - 1))
                        sumOne += mas[i][j];
                    else
                        sumTwo += mas[i][j];

                }
            }
            if (sumOne == sumTwo)
                flag = true;
            count++;
        } while (!flag);
        System.out.println("Вокруг = " + sumOne + ", внутри = " + sumTwo);
        return count;
    }

    public void test2212() {
        int[][] mas = new int[n][m];
        System.out.print("Введите значение к:");
        int k = num.nextInt();
        random(mas, min, max);
        outputMasInt(mas);
        System.out.println(result2212(mas, k));
    }
    public int result2212(int[][] mas, int k) {
        int sumK = 0, max = 0, g = 1;
        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            for (int j = 0; j < mas[0].length; j++) {
                sum += mas[j][i];
                if (j == k - 1)
                    sumK += mas[i][j];
            }
            if (sum > max)
                max = sum;
            System.out.println("Сумма " + g + " столбца = " + sum);
            g++;
        }
        System.out.println("Наибольшая сумма столбцов = " + max);
        return sumK;

    }

    public void test2211() {
        int[][] mas = new int[n][m];
        System.out.print("Введите значение к:");
        int k = num.nextInt();
        random(mas, min, max);
        outputMasInt(mas);
        System.out.println(result2211(mas, k));
    }
    public int result2211(int[][] mas, int k) {
        int sumK = 0;
        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            for (int j = 0; j < mas[0].length; j++) {
                sum += mas[i][j];
                if (i == k - 1)
                    sumK += mas[i][j];
            }
            System.out.println("Сумма " + (i + 1) + " строки = " + sum);
        }
        return sumK;
    }

    public void test2210() {
        int[][] mas = new int[n][m];
        random(mas, min, max);
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++)
                sum += mas[i][j];
        }
        outputMasInt(mas);
        System.out.println(sum);
    }

    public void test2208() {
        System.out.print("Введите х: ");
        int x = num.nextInt();
        n = 5;
        m = 5;
        min = 1;
        max = 9;
        int[][] mas = new int[n][m];
        random(mas, min, max);
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                if (mas[i][j] != x)
                    mas[i][j] = 0;
                else
                    count++;
            }
        }
        System.out.println(count);
        outputMasInt(mas);
    }

    public void test2207() {
        n = 5;
        m = 5;
        int[][] mas = new int[n][m];
        result2207(mas);
        outputMasInt(mas);
    }
    public void result2207(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++)
                mas[i][j] = j + 1;
        }
    }

    public void test2206() {
        int[][] mas = new int[2][10];
        min = 10;
        max = 99;
        result2206(mas, min, max);
        outputMasInt(mas);
    }
    public void result2206(int[][] mas, int min, int max) {
        for (int i = 0; i < mas.length; i++) {
            int random = (int) (Math.random() * ((max - min) + 1) + min);
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = random;
        }
    }

    public void test2205() {
        int[][] mas = new int[6][14];
        min = 30;
        max = 125;
        random(mas, min, max);
        outputMasInt(mas);
    }

    public void random(int[][] mas, int min, int max) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++)
                mas[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
        }
    }

    public void chess() {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0)
                    chessBoard[i][j] = "W";
                else
                    chessBoard[i][j] = "B";
            }
        }
        outputMasStr(chessBoard);
    }

    public void outputMasInt(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[0].length; j++) {
                System.out.printf("%4d",mas[i][j]);
            }
        }
        System.out.println();
    }

    public void outputMasStr(String[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
        }
        System.out.println();
    }
}
