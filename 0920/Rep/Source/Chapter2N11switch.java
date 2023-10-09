package assignment;

import java.util.Scanner;

public class Chapter2N11switch {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 달 입력 받기
        System.out.print("달을 입력하세요(1~12): ");
        int month = scanner.nextInt();
        String season;

        // switch 문을 사용하여 계절 판별
        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                season = "잘못 입력";
                break;
        }

        // 결과 출력
        System.out.println(season);

        // Scanner 닫기
        scanner.close();
    }
}
