package other.tasks;

import lesson19.Labs;

import java.sql.SQLOutput;

public class Fibonachi {

    public void run() {
        test2();
    }


    private void test2() {
        System.out.print("Введите число: ");
        int n = Labs.num.nextInt();
        String st = "";

        if (n < 0) st = n + "<0";
        else if (n == 0) st = n + "=0";
        else {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
                st += i;

                if (i < n) st += "+";
            }
            st += "=" + sum;
        }

        System.out.println(st);
    }

    private void test1() {
        String input = "camelCasing";
        String result = input.replaceAll("(?=[A-Z])", "$0 ");
        System.out.println(result);
    }

    private void fibonachi() {
        System.out.println("Введите количество значений: ");
        int n = Labs.num.nextInt();
        int x = 0, y = 0, z = 1;

        System.out.println("Числа Фибоначчи:");
        for (int i = 0; i <= n; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.println(x);
        }
    }
}
