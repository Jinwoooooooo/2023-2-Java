package assignment;

import java.util.Random;

public class Chapter3N9 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][4];

        // 2차원 배열에 1에서 10까지 범위의 랜덤한 정수 삽입
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(10) + 1;
            }
        }

        // 2차원 배열 출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

