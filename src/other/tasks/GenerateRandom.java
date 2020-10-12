package other.tasks;

import com.sun.tools.javac.Main;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandom {
    private ThreadLocalRandom random = ThreadLocalRandom.current();
    private int[] mas;
    private int[][] masTwo;

    public void GenerateRandom(int n) {
        mas = new int[n];
        generateRandom();
        printOne(mas);
    }

    public void GenerateRandom(int n, int m) {
        masTwo = new int[n][m];
        generateRandomTwo();
        printTwo(masTwo);
    }

    public int[][] returnMasTwo() {
        return masTwo;
    }

    public int[] returnMas() {
        return mas;
    }

    private void generateRandomTwo() {
        for (int i = 0; i < masTwo.length; i++) {
            for (int j = 0; j < masTwo[i].length; j++)
                masTwo[i][j] = random.nextInt(1, 100);
        }
    }

    private void generateRandom() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-100, 100);
        }
    }

    private void printTwo(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++)
                System.out.print(mas[i][j] + " ");
        }
        System.out.println();
    }

    private void printOne(int[] mas) {
        for (int i = 0; i < mas.length; i++)
            System.out.print( mas[i] + " ");
        System.out.println();
    }
}
