package assignment;

import java.util.Scanner;

public class Chapter2N08 {
    // inRect 메소드 정의
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        return (x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2);
    }

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 두 점 (x1, y1)와 (x2, y2) 입력 받기
        System.out.print("첫 번째 점 (x1, y1)의 좌표를 입력하세요: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("두 번째 점 (x2, y2)의 좌표를 입력하세요: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // 충돌 판별
        boolean isColliding = false;

        if ((inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))) {
            isColliding = true;
        }

        // 결과 출력
        if (isColliding) {
            System.out.println("입력한 직사각형과 (100, 100)과 (200, 200)의 직사각형이 충돌합니다.");
        } else {
            System.out.println("입력한 직사각형과 (100, 100)과 (200, 200)의 직사각형이 충돌하지 않습니다.");
        }

        // Scanner 닫기
        scanner.close();
    }
}
