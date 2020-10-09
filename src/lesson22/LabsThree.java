package lesson22;

import other.tasks.Tasks;
import lesson19.Labs;

import java.util.Scanner;
import java.util.Arrays;

public class LabsThree {
    Tasks tak = new Tasks();
    Labs l19 = new Labs();
    private Scanner num = new Scanner(System.in);
    private int min = 1, max = 3, n = 10, m = 10;
    private int[][] mas;

    public void test2228() {
//        n = l19.masSize();
//        m = l19.masSize();
        int[][] mas = new int[n][m];
        tak.random(mas);
        tak.write(mas);
        int c = l19.cellMas() - 1;
        int k = l19.cellMas() - 1;
        System.out.println(result22281(mas, c, k));
        result22282(mas);
        System.out.println(result22283(mas, c, k));

    }
    public boolean result22281(int[][] mas, int c, int k) {
        boolean flag = false;
        int count = 0;
        for (int i = c - 1; i <= c + 1; i++) {
            for (int j = k - 1; j <= k + 1; j++) {
                if (mas[c][k] > mas[i][j])
                    count++;
            }
            if (count == 8)
                flag = true;
        }
        System.out.println();
        return flag;
    }
    public void result22282(int[][] mas) {
        for (int g = 1; g < mas.length - 1; g++) {
            for (int f = 1; f < mas[g].length - 1; f++) {
                int count = 0;
                for (int i = g - 1; i <= g + 1; i++) {
                    for (int j = f - 1; j <= f + 1; j++) {
                        if (mas[g][f] > mas[i][j])
                            count++;
                    }
                }
                if (count == 8)
                    System.out.print("[" + g + "." + f + "] ");
            }
        }
    }
    public boolean result22283(int[][] mas, int c, int k) {
        int globalCount = 0;
        for (int g = 1; g < mas.length - 1; g++) {
            for (int f = 1; f < mas[0].length - 1; f++) {
                int count = 0;
                for (int i = g - 1; i <= g + 1; i++) {
                    for (int j = f - 1; j <= g + 1; j++) {
                        if (mas[g][f] > mas[i][j])
                            count++;
                    }
                }
                if (count == 8) {
                    System.out.print("[" + g + "." + f + "] ");
                    globalCount++;
                    if (mas[c][k] > mas[g][f])
                        globalCount--;
                }
            }
        }
        System.out.println();
        if (globalCount == 1)
            return true;
        else
            return false;
    }

    public void test2227() {
        n = l19.masSize();
        m = l19.masSize();
        int[][] masOne = new int[n][n];
        n = l19.masSize();
        m = l19.masSize();
        int[][] masTwo = new int[n][n];
        System.out.println(result2227(masOne,masTwo));
    }
    public int result2227(int[][] masOne, int[][] masTwo) {
//        if (masOne.length > masTwo.length)
//            return false;
//        if (masOne[0].length > masTwo[0].length)
//            return false;
        for (int[] i: masOne) {
            for (int j: i)
                j = 0;
        }
        for (int[] i: masTwo) {
            for (int j: i)
                j = 0;
        }
        boolean flag = false;
        int count = 0;
        do {
            random(masOne, min, max);
            random(masTwo, min, max);
            for (int k = 0; k < (masTwo.length - masOne.length); k++) {
                for (int f = 0; f < (masTwo[0].length - masOne[0].length); f++) {
                    int countTwo = 0;
                    for (int i = 0; i < masOne.length; i++)
                        for (int j = 0; j < masOne[i].length; j++) {
                            if (masOne[i][j] == masTwo[i + k][j + f])
                                countTwo++;
                        }
                    if (countTwo == masOne[0].length * masOne[0].length)
                        flag = true;
                }
                count++;
            }
        } while (!flag);
        tak.write(masOne);
        tak.write(masTwo);
        return count;
    }

    public void test2226() {
        mas = new int[n][m];
        int[][] masTwo = new int[n][m];
        System.out.println(result2226(mas, masTwo));
    }
    public int result2226(int[][] mas, int[][] masTwo) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = 0;
                masTwo[i][j] = 0;
            }
        }
        int count = 0;
        boolean flag = false;
        do {
            tak.random(mas);
            tak.random(masTwo);
            int countTwo = 0;
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    if (mas[i][j] == masTwo[i][j])
                        countTwo++;
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            if (countTwo == mas.length * mas[0].length)
                flag = true;
            count++;
        } while (!flag);
        tak.write(mas);
        tak.write(masTwo);
        return count;
    }

    public void test2225() {
        mas = new int[n][m];
        int k = l19.inputOne();
        random(mas, min, max);
        tak.write(mas);
        System.out.println(result2225(mas, k));
    }
    public boolean result2225(int[][] mas, int k) {
        k -= 1;
        boolean flag = false;
        int count = 0;
        for (int j = 0; j < mas[k].length - 1; j++) {
            if (mas[k][j] < mas[k][j + 1])
                count++;
        }
        if (count == mas[k].length - 1)
            flag = true;
        return flag;
    }

    public void test2224() {
        int[] m = new int[n];
        l19.masRandom(m, min, max);
        l19.outputPrintf(m);
        mas = result2222(m);
        tak.write(mas);
        System.out.println(result2224(mas));
    }
    public boolean result2224(int[][] mas) {
        boolean flag = true;
        for (int i = 0; i < mas.length; i++) {
            if (mas.length == mas[i].length)
                flag = true;
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void test2223() {
        mas = new int[n][m];
        tak.random(mas);
        tak.write(mas);
        System.out.println(result2223(mas));

    }
    public int result2223(int[][] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int x = mas[i][j];
                int countTwo = 0;
                for (int k = 1; k <= x; k++) {
                    if (mas[i][j] % k == 0)
                        countTwo++;
                }
                if (countTwo <= 2)
                    count++;
            }
        }
        return count;
    }

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
