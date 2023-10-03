package assignment;

import java.util.Random;

public class Chapter3N10 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][4];

        // 2차원 배열에 1에서 10까지 범위의 랜덤한 정수 삽입
        for (int k = 0; k < 10; k++) {
            int row, col, value;
            do {
                row = random.nextInt(4); // 0부터 3까지의 랜덤한 행 인덱스
                col = random.nextInt(4); // 0부터 3까지의 랜덤한 열 인덱스
                value = random.nextInt(10) + 1; // 1부터 10까지 범위의 랜덤한 정수
            } while (array[row][col] != 0); // 해당 위치에 이미 값이 있는 경우 다시 랜덤하게 선택

            array[row][col] = value;
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

