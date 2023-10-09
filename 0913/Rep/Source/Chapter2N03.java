package assignment;

import java.util.Scanner;

public class Chapter2N03 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        int moneyAmount = scanner.nextInt();

        // 오만 원권 개수 계산
        int fiftyThousandWonCount = moneyAmount / 50000;
        moneyAmount %= 50000;

        // 만 원권 개수 계산
        int tenThousandWonCount = moneyAmount / 10000;
        moneyAmount %= 10000;

        // 천 원권 개수 계산
        int thousandWonCount = moneyAmount / 1000;
        moneyAmount %= 1000;

        // 500원짜리 동전 개수 계산
        int fiveHundredWonCount = moneyAmount / 500;
        moneyAmount %= 500;

        // 100원짜리 동전 개수 계산
        int hundredWonCount = moneyAmount / 100;
        moneyAmount %= 100;

        // 50원짜리 동전 개수 계산
        int fiftyWonCount = moneyAmount / 50;
        moneyAmount %= 50;

        // 10원짜리 동전 개수 계산
        int tenWonCount = moneyAmount / 10;
        moneyAmount %= 10;

        // 1원짜리 동전 개수 계산
        int oneWonCount = moneyAmount;

        // 변환 결과 출력
        System.out.println("오만 원: " + fiftyThousandWonCount + "장");
        System.out.println("만 원: " + tenThousandWonCount + "장");
        System.out.println("천 원: " + thousandWonCount + "장");
        System.out.println("오백 원: " + fiveHundredWonCount + "개");
        System.out.println("백 원: " + hundredWonCount + "개");
        System.out.println("오십 원: " + fiftyWonCount + "개");
        System.out.println("십 원: " + tenWonCount + "개");
        System.out.println("일 원: " + oneWonCount + "개");

        // Scanner 닫기
        scanner.close();
    }
}
