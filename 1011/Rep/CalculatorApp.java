package assignment4;

import java.util.Scanner;

class Add {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a + b;
    }
}

class Sub {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a - b;
    }
}

class Mul {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a * b;
    }
}

class Div {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("나누기는 0으로 할 수 없습니다.");
            return 0;
        }
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 (예: 5 5 *): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                Add add = new Add();
                add.setValue(num1, num2);
                System.out.println(add.calculate());
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(num1, num2);
                System.out.println(sub.calculate());
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(num1, num2);
                System.out.println(mul.calculate());
                break;
            case '/':
                Div div = new Div();
                div.setValue(num1, num2);
                System.out.println(div.calculate());
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
        }

        scanner.close();
    }
}
