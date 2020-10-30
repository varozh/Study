import lesson19.Labs;
import lesson21.LabsTwo;
import lesson22.LabsThree;
import other.tasks.*;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Labs l19 = new Labs();
//        l19.test1938();
//        l19.MoreArray();
//        l19.test1942();
//        l19.test1971();
//        l19.test2028();
        LabsTwo l21 = new LabsTwo();
//        l21.test2122();
        LabsThree l22 = new LabsThree();
//        l22.chess();
//        l22.test2228();
        Tasks tak = new Tasks();
//        tak.result();
//        tak.solutionMas();
//        tak.task();
//        sortSelection();
        System.out.println("(.)(.)"); //artimon commit in github
//        tak.task();
        PrimeNumbersFrom2To100 primeNumbers = new PrimeNumbersFrom2To100();
//        primeNumbers.run();
        NotPrimeNumberFrom2To100 notPrimeNumber = new NotPrimeNumberFrom2To100();
//        notPrimeNumber.run();
        ConverString con = new ConverString();
//        con.run(LabsTwo.inputString());
//        testSort();
//        testRemoveElem();
//        String st = LabsTwo.inputString();
//        RandomWord word = new RandomWord(st);
//        MatchModel cube = new MatchModel();
//        cube.print();
//        DublecateCount dub = new DublecateCount();
//        dub.run();
//        dub.print();
//        WalkStreet walk = new WalkStreet();
//        walk.run();
//        DeleteElem elems = new DeleteElem();
//        elems.run();
//        SpravochnikJava8 spr = new SpravochnikJava8();
        int[] masOne = { 10, 20, 51, -156, 235, -125, -2, -10, 228 };
        Labs.outputPrintf(masOne);

        for (int i = 0; i < masOne.length; i++) {
            for (int j = masOne.length - 1; j > i; j--) {
                if (masOne[j] > masOne[j - 1]) {
                    int tmp = masOne[j];
                    masOne[j] = masOne[j - 1];
                    masOne[j - 1] = tmp;
                }
            }
        }
        Labs.outputPrintf(masOne);
        System.out.println();

        int[] masTwo =  { 99, -10, 123, 18, -978, 5623, 463, -9, 287, 49 };
        Labs.outputPrintf(masTwo);

        for (int i = 0; i < masTwo.length; i++) {
            int maxIndex = i;
            int maxNum = masTwo[i];
            for (int j = i + 1; j < masTwo.length; j++) {
                if (masTwo[j] > maxNum) {
                    maxIndex = j;
                    maxNum = masTwo[j];
                }
            }
            int tmp = masTwo[i];
            masTwo[i] = maxNum;
            masTwo[maxIndex] = tmp;
        }
        Labs.outputPrintf(masTwo);
}

    public static void testRemoveElem() {
        GenerateRandom rand = new GenerateRandom();
        rand.GenerateRandom(10);
        int[] mas = rand.returnMas();
        Tasks tak = new Tasks();
        tak.removeElem(mas);
    }

    public static void testSort() {
        GenerateRandom rand = new GenerateRandom();
        rand.GenerateRandom(7);
        int[] mas = rand.returnMas();
        SortBubble bubble = new SortBubble(mas.length);
        for (int i = 0; i < mas.length; i++)
            bubble.into(mas[i]);
        bubble.bubbleSort();
        bubble.print();

    }

    public static void sortBubble() {
        int n = Labs.masSize();
        SortBubble bubble = new SortBubble(n);
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++)
            bubble.into(mas[i]);
        Labs.outputPrintf(mas);
        bubble.bubbleSort();
        Labs.outputPrintf(mas);
    }

    public static void sortSelection() {
        int n = Labs.masSize();
        SortSelection selection = new SortSelection(n);
        int[] mas = new int[n];
        Labs.masRandom(mas, 150, 300);
        for (int i = 0; i < mas.length; i++)
            selection.into(mas[i]);
        Labs.outputPrintf(mas);
        selection.sortMas(mas);
        Labs.outputPrintf(mas);
    }
}
