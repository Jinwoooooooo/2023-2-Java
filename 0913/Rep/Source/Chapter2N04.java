package assignment;

import java.util.Scanner;

public class Chapter2N04 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 중간 크기의 수를 찾는 로직
        int middleNumber;
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            middleNumber = num1;
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            middleNumber = num2;
        } else {
            middleNumber = num3;
        }

        // 중간 크기의 수 출력
        System.out.println("중간 값은: " + middleNumber);

        // Scanner 닫기
        scanner.close();
    }
}
