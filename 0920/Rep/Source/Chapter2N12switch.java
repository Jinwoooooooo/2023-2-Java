package assignment;

import java.util.Scanner;

public class Chapter2N12switch {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 피연산자와 연산자 입력 받기
        System.out.print("연산: ");
        double operand1 = scanner.nextDouble();
        String operator = scanner.next();
        double operand2 = scanner.nextDouble();

        // 연산 수행 및 결과 출력
        double result = 0.0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    // 프로그램 종료
                    System.exit(1);
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("올바르지 않은 연산자입니다.");
                // 프로그램 종료
                System.exit(1);
        }

        System.out.println(operand1 + " " + operator + " " + operand2 + "의 계산 결과는 " + result);

        // Scanner 닫기
        scanner.close();
    }
}
