import lesson19.Labs;
import lesson21.LabsTwo;
import lesson22.LabsThree;
import other.tasks.Tasks;
import other.tasks.SortBubble;
import other.tasks.SortSelection;
import other.tasks.PrimeNumbersFrom2To100;


public class Main {
    public static void main(String[] args) {
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
        PrimeNumbersFrom2To100 primeNumbers = new PrimeNumbersFrom2To100();
        primeNumbers.run();
    }

    public void sortBubble() {
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
