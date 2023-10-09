package assignment;

import java.util.Scanner;

public class Chapter2N09 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 원의 중심과 반지름 입력 받기
        System.out.print("원의 중심과 반지름 입력 : ");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();
        double radius = scanner.nextDouble();

        // 점 입력 받기
        System.out.print("점 입력 : ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // 원의 내부 판별
        double distance = Math.sqrt(Math.pow(x - cx, 2) + Math.pow(y - cy, 2));
        boolean isInside = distance <= radius;

        // 결과 출력
        if (isInside) {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
        } else {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 없다.");
        }

        // Scanner 닫기
        scanner.close();
    }
}
