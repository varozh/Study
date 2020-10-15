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
        System.out.println();
        print();
    }

    public void print() {
        for (int i = 0; i < road.length; i++) {
            System.out.print(road[i] + "  ");
        }
    }
}
