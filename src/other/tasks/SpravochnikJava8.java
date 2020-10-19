package other.tasks;

import java.io.IOException;
import java.util.Scanner;

public class SpravochnikJava8 {
    private Scanner num = new Scanner(System.in);
    private int n;

    public SpravochnikJava8() throws IOException {
        dz2();
    }

    private void spravka() {
        System.out.println("Справочник: \n");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue ");
        System.out.println("0 для выхода\n");

        System.out.print("Выбирайте: ");
        do {
            n = num.nextInt();
        } while (n < 0 | n > 7);
        System.out.println();
        choice();
    }

    private void choice() {
        switch (n) {
            case 1:
                System.out.println("Oпepaтop if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case 2:
                System.out.println("Oпepaтop switch:\n");
                System. out. println ( "swi tch (выражение) { ") ;
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            case 3:
                System.out.println("Oпepaтop for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case 4:
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case 5:
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            case 6:
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
                break;
            case 7:
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
    }

    private void dz() {
        for (int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void dz2() throws IOException {
        System.out.println(" Напишите программу, которая получает символы, введенные с клавиатуры, до\n" +
                "тех пор, пока не встретится точка. Предусмотрите в программе счетчик пробелов.\n" +
                "Сведения о количестве пробелов должны выводиться в конце программы.");
        char c;
        int count = 0;
        do {
            System.out.println("Введите символ: ");
            c = (char) System.in.read();
            if (c == ' ')
                count++;
        } while (c != '.');
        System.out.println(count);
    }
}
