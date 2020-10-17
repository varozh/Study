package other.tasks;

import lesson19.Labs;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElem {
    private Scanner num = new Scanner(System.in);
    private int[] elems;
    private int n;
    private ArrayList<Integer> resultElems = new ArrayList<>();

    public DeleteElem() {
        System.out.print("Введите количество повторений: ");
        n = num.nextInt();
        elems = new int[Labs.masSize()];
        for (int i = 0; i < elems.length; i++) {
            elems[i] = (int) ((Math.random() * 10) + 1);
//            System.out.println("Введи " + (i + 1) + " элемент: ");
//            elems[i] = num.nextInt();
        }
        Labs.outputPrintf(elems);
    }

    public DeleteElem(int n) {
        this.n = n;
    }

    public DeleteElem(int[] elems) {
        this.elems = elems;
    }

    public DeleteElem(int[] elems, int n) {
        this.elems = elems;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < elems.length; i++) {
            int count = 0;
            for (int j = 0; j < resultElems.size(); j++) {
                if (elems[i] == resultElems.get(j))
                    count++;
            }
            if (count < n)
                resultElems.add(elems[i]);
        }
        print();
    }

    public void print() {
        System.out.println(resultElems);
    }
}
