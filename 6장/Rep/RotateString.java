package assignment6;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하시오: ");
        String input = scanner.nextLine();

        rotateAndPrint(input);
    }

    private static void rotateAndPrint(String str) {
        // 문자열의 길이만큼 반복하여 회전하며 출력
        for (int i = 0; i < str.length(); i++) {
            // 회전된 문자열 출력
            String rotated = str.substring(i) + str.substring(0, i);
            System.out.println(rotated);
        }
    }
}
