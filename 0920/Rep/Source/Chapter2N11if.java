package assignment;

import java.util.Scanner;

public class Chapter2N11if {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 달 입력 받기
        System.out.print("달을 입력하세요(1~12): ");
        int month = scanner.nextInt();

        // 계절 판별
        String season;

        if (month >= 3 && month <= 5) {
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            season = "여름";
        } else if (month >= 9 && month <= 11) {
            season = "가을";
        } else if (month == 12 || month == 1 || month == 2) {
            season = "겨울";
        } else {
            season = "잘못 입력";
        }

        // 결과 출력
        System.out.println(season);

        // Scanner 닫기
        scanner.close();
    }
}

