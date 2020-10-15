package other.tasks;

import java.util.Scanner;

public class MatchModel {
    private Scanner num = new Scanner(System.in);
    private int n;
    private int x;
    private int x1, x2, x3;

    public MatchModel() {
        System.out.print("Введите длину: ");
        int n = num.nextInt();
        this.n = n;
        run();
    }

    public MatchModel(int n) {
        this.n = n;
        run();
    }

    private void run() {
//        model1d();
        model2d();
    }

    private void model1d() {
        x1 = 4 + (n - 1) * 3;
    }

    private void model2d() {
        int x = (int) (Math.sqrt(n)) - 1;
        int y = 0;
        if (n <= x * (x + 1))
            y = x + 1;
        this.x2 = 4 + 3 * (x + y) + 2 * (n - x - y);
    }

    public void print() {
        System.out.println(x1);
        System.out.println(x2);
    }
}
