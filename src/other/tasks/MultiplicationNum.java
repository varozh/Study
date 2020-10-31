package other.tasks;

import lesson21.LabsTwo;

public class MultiplicationNum {
    private int n;
    private int count = 0;

    public MultiplicationNum(int n) {
        this.n = n;
    }

    public MultiplicationNum() {
        System.out.print("Введите число: ");
        this.n = LabsTwo.num.nextInt();
    }

    public int result() {
        boolean flag = (this.n < 10);
        while (!flag) {
            searchNum();
            if (this.n < 10)
                flag = true;
            this.count++;
        }
        return count;
    }

    private void searchNum() {
        int n = this.n;
        int i;
        for (i = 0; n > 0; i++)
            n /= 10;
        int[] masNum = new int[i];
        for (i = 0, n = this.n; n > 0; i++) {
            masNum[i] = n % 10;
            n /= 10;
        }
        creatNewNum(masNum);
    }

    private void creatNewNum(int[] masNum) {
        int sum = 1;
        for (int i = 0; i < masNum.length; i++)
            sum *= masNum[i];
        this.n = sum;
    }
}
