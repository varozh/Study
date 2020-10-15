package other.tasks;

public class WalkStreet {
    private boolean flag;
    private String[] sides = {"N↑", "S↓", "W←", "E→"};
    private char[] side = {'N', 'S', 'W', 'E'};
    private String[] road = new String[10];

    public WalkStreet() {
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 4);
            road[i] = String.valueOf(side[random]);
            System.out.print(sides[random] + " ");
        }
        resultWalks();
    }

    private void resultWalks() {
        int x = 0, y = 0;
        for (int i = 0; i < road.length; i++) {
            if (road[i].equals("N"))
                y++;
            else if (road[i].equals("S"))
                y--;
            if (road[i].equals("W"))
                x--;
            else if (road[i].equals("E"))
                x++;
        }
        System.out.println();
        System.out.println("x = " + x + ", y = " + y);
        if (x == 0 && y == 0)
            flag = true;
        else
            flag = false;
        print();
    }

    public void print() {
        System.out.print(flag);
    }
}
