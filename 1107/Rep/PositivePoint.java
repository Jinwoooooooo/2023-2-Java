package assignment5;

class Point4 {
    protected int x, y;

    public Point4() {
        this.x = 0;
        this.y = 0;
    }

    public Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class PositivePoint extends Point4 {
    public PositivePoint() {
        super();
    }

    public PositivePoint(int x, int y) {
        // Ensure that the coordinates are positive
        super(x > 0 ? x : 0, y > 0 ? y : 0);
    }

    // Override the move method to ensure positive coordinates
    public void move(int x, int y) {
        super.move(x > 0 ? x : 0, y > 0 ? y : 0);
    }
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}