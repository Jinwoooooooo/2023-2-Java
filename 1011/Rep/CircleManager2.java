package assignment4;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleManager2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] c = new Circle[3]; // 3개의 Circle 배열 선언

        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >> ");
            double x = scanner.nextDouble(); // x 값을 읽기
            double y = scanner.nextDouble(); // y 값을 읽기
            int radius = scanner.nextInt();  // 반지름 읽기
            c[i] = new Circle(x, y, radius); // Circle 객체 생성
        }
        Circle largestCircle = c[0];
        for (int i = 1; i < c.length; i++) {
            if (c[i].getArea() > largestCircle.getArea()) {
                largestCircle = c[i];
            }
        }
        System.out.print("가장 면적이 큰 원은 ");
        largestCircle.show();
        scanner.close();
    }
}

