package assignment6;

class Middle {
    int x, y, radius;

    public Middle(int x, int y, int radius) {
        super();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Middle other = (Middle) obj;
        return x == other.x && y == other.y && radius == other.radius;
    }
}

public class Circle extends Middle {
    public Circle(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return x == other.x && y == other.y && radius == other.radius;
    }

    @Override
    public String toString() {
        return "Circle(" + x + "," + y + ") 반지름" + radius;
    }

    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if (a.equals(b))
            System.out.println("서로 다른 원");
        else
            System.out.println("같은 원");
    }
}
