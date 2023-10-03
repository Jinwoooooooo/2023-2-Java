package assignment;

import java.util.Scanner;
import java.util.Random;

public class Chapter3N8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("정수 몇 개? ");
        int size = scanner.nextInt();

        if (size >= 100) {
            System.out.println("100보다 작은 개수를 입력하세요.");
            return;
        }

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(100) + 1;
            } while (contains(numbers, randomNumber));

            numbers[i] = randomNumber;
        }

        // 배열 출력
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }

    // 배열에 해당 숫자가 포함되어 있는지 확인하는 메소드
    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}

