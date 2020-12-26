package other.tasks;

import lesson19.Labs;

import java.sql.SQLOutput;

public class Fibonachi {

    public void run() {
        test1();
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
