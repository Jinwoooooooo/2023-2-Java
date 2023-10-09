package assignment;

import java.util.Scanner;

public class Chapter2N10 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 원의 정보 입력 받기
        System.out.print("첫 번째 원의 중심과 반지름 입력 : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();

        // 두 번째 원의 정보 입력 받기
        System.out.print("두 번째 원의 중심과 반지름 입력 : ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        // 두 원이 겹치는지 판별
        double distanceBetweenCenters = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        boolean areOverlapping = distanceBetweenCenters <= radius1 + radius2;

        // 결과 출력
        if (areOverlapping) {
            System.out.println("두 원은 서로 겹칩니다.");
        } else {
            System.out.println("두 원은 겹치지 않습니다.");
        }

        // Scanner 닫기
        scanner.close();
    }
}
