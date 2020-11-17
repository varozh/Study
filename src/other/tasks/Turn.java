package other.tasks;

import lesson19.Labs;

public class Turn {
    private char[] c;
    private int putloc, getloc;

    public Turn(int size) {
        this.c = new char[size + 1];
        putloc = getloc = 0;
    }

    public Turn() {
        System.out.print("Введите размер массива: ");
        int size = Labs.num.nextInt();
        this.c = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == c.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        c[putloc] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return c[getloc];
    }
}
