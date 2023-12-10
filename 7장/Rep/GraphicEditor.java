package assignment7;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
    abstract void draw();
}

class Line extends Shape {
    @Override
    void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle");
    }
}

public class GraphicEditor {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("그래픽 에디터 beauty를 실행합니다.\n삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int shapeType = scanner.nextInt();
                    insertShape(shapes, shapeType);
                    break;
                case 2:
                    deleteShape(shapes);
                    break;
                case 3:
                    viewAllShapes(shapes);
                    break;
                case 4:
                    System.out.println("beauty를 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
            }
        }
    }

    private static void insertShape(Vector<Shape> shapes, int shapeType) {
        Shape shape;
        switch (shapeType) {
            case 1:
                shape = new Line();
                break;
            case 2:
                shape = new Rect();
                break;
            case 3:
                shape = new Circle();
                break;
            default:
                System.out.println("잘못된 도형 타입입니다.");
                return;
        }
        shapes.add(shape);
    }

    private static void deleteShape(Vector<Shape> shapes) {
        System.out.print("삭제할 도형의 위치>> ");
        int position = new Scanner(System.in).nextInt();

        if (position >= 1 && position <= shapes.size()) {
            shapes.remove(position - 1);
        } else {
            System.out.println("삭제할 수 없습니다.");
        }
    }

    private static void viewAllShapes(Vector<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
