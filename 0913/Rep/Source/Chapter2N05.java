package assignment;

import java.util.Scanner;

public class Chapter2N05 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 변의 길이를 나타내는 정수 3개를 입력하세요.");
        System.out.print("첫 번째 변의 길이: ");
        int side1 = scanner.nextInt();

        System.out.print("두 번째 변의 길이: ");
        int side2 = scanner.nextInt();

        System.out.print("세 번째 변의 길이: ");
        int side3 = scanner.nextInt();

        // 삼각형 판별 조건 검사
        if (isTriangle(side1, side2, side3)) {
            System.out.println("삼각형을 만들 수 있습니다.");
        } else {
            System.out.println("삼각형을 만들 수 없습니다.");
        }

        // Scanner 닫기
        scanner.close();
    }

    // 삼각형 판별 함수
    public static boolean isTriangle(int side1, int side2, int side3) {
        // 세 변의 길이가 양수인지 검사
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        // 삼각형의 성립 조건 검사
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
