package assignment;

import java.util.Scanner;

public class Chapter2N06 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 99까지의 정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 정수에 3, 6, 9 중 하나가 있는지 여부를 판별
        boolean hasThree = (number % 10 == 3);
        boolean hasSix = (number % 10 == 6);
        boolean hasNine = (number % 10 == 9);

        boolean hasThrees = (number >= 10 && number <= 99 && (number / 10 == 3 || number / 10 == 6 || number / 10 == 9));

        // "박수짝" 또는 "박수짝짝" 출력
        if ((hasThree || hasSix || hasNine) && hasThrees) {
            System.out.println("박수짝짝");
        } else if (hasThree || hasSix || hasNine) {
            System.out.println("박수짝");
        } else {
            System.out.println("...");
        }

        // Scanner 닫기
        scanner.close();
    }
}
