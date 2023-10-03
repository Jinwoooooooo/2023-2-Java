package assignment;

import java.util.Scanner;

public class Chapter3N4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        String s = scanner.next(); // 문자열 읽기
        char c = s.charAt(0); // 문자열의 첫 번째 문자
        scanner.close();

        // 입력된 알파벳부터 'a'까지 역순으로 출력
        for (char currentChar = c; currentChar >= 'a'; currentChar--) {
            for (char ch = 'a'; ch <= currentChar; ch++) {
                System.out.print(ch);
            }
            System.out.println(); // 한 행 출력 후 줄 바꿈
        }
    }
}


