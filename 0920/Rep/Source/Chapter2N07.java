package assignment;

import java.util.Scanner;

public class Chapter2N07 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 정수 x와 y 입력 받기
        System.out.print("x 좌표를 입력하세요: ");
        int x = scanner.nextInt();
        System.out.print("y 좌표를 입력하세요: ");
        int y = scanner.nextInt();

        // 직사각형 안에 있는지 판별
        boolean isInsideRectangle = (x >= 100 && x <= 200) && (y >= 100 && y <= 200);

        // 결과 출력
        if (isInsideRectangle) {
            System.out.println("입력한 점 (" + x + ", " + y + ")은 직사각형 안에 있습니다.");
        } else {
            System.out.println("입력한 점 (" + x + ", " + y + ")은 직사각형 밖에 있습니다.");
        }

        // Scanner 닫기
        scanner.close();
    }
}
