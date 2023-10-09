package assignment;

import java.util.Scanner;

public class Chapter2N02 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scn = new Scanner(System.in);

        System.out.print("2자리 정수(10~99)를 입력하세요: ");
        int inputNumber = scn.nextInt();

        // 입력받은 정수가 10보다 크고 99보다 작은지 검사
        if (inputNumber >= 10 && inputNumber <= 99) {
            // 십의 자리와 일의 자리를 분리
            int ten = inputNumber / 10;
            int one = inputNumber % 10;

            // 십의 자리와 일의 자리가 같은지 검사
            if (ten == one) {
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
            } else {
                System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
            }
        } else {
            System.out.println("올바른 범위의 정수를 입력하세요 (10~99).");
        }

        // Scanner 닫기
        scn.close();
    }
}
