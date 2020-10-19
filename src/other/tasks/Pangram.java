package other.tasks;

import lesson22.LabsThree;

public class Pangram {
    private String pn;
    private boolean flag;

    public Pangram() {
        LabsThree sc = new LabsThree();
        System.out.print("Введите строку: ");
        pn = sc.num.nextLine();
    }

    public Pangram(String pn) {
        this.pn = pn;
    }

    public void check() {
        pn = pn.toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if (!pn.contains(String.valueOf(i))) {
                flag = false;
                break;
            }
            flag = true;
        }
        System.out.println(flag);
    }
}
