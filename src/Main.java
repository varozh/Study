import lesson19.Labs;
import lesson21.LabsTwo;
import lesson22.LabsThree;
import other.tasks.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
//        Pangram pn = new Pangram();
//        pn.isogram();
//        FindMaxMinInString find = new FindMaxMinInString();
//        ArrayList<int[]> list = new ArrayList<int[]>();
//        list.add(new int[] {10,0});
//        list.add(new int[] {3,5});
//        list.add(new int[] {2,5});
//        PeopleInTheBus bus = new PeopleInTheBus();
//        bus.into(list);
//        bus.binaryArrayToNumber(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
//        String str = "123456987654";
//        int sz = 6;
//        NumString numOr = new NumString(str, sz);
//        numOr.run();

//        int[] masOne = { 10, 20, 51, -156, 235, -125, -2, -10, 228 };
//        Labs.print(masOne);

//        int[] masTwo =  { 99, -10, 123, 18, -978, 46, 5623, -9, 2287, 49 };
//        Labs.print(masTwo);
        
//        MultiplicationNum multiplication = new MultiplicationNum(4);
//        System.out.println(multiplication.result());
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
