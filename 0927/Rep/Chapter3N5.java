package assignment;

import java.util.Scanner;

public class Chapter3N5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10]; // 크기가 10인 정수 배열을 생성

        // 양의 정수 10개 입력 받기
        System.out.print("양의 정수 10개를 입력하시오>> ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("3의 배수는 ");
        // 배열에서 3의 배수인 정수 출력
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
        scanner.close();
    }
}

