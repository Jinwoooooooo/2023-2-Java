package assignment7;

import java.util.Scanner;
import java.util.Vector;

public class RainfallAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> rainfallData = new Vector<>();

        while (true) {
            // 강수량 입력
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int rainfall = scanner.nextInt();

            // 0 입력 시 종료
            if (rainfall == 0) {
                break;
            }

            // 벡터에 강수량 추가
            rainfallData.add(rainfall);

            // 현재 입력된 강수량과 평균 출력
            printRainfallData(rainfallData);
        }

        scanner.close();
    }

    // 현재 입력된 강수량과 평균을 출력하는 메서드
    private static void printRainfallData(Vector<Integer> rainfallData) {
        int totalRainfall = 0;

        // 현재 입력된 강수량 출력
        System.out.print("현재 강수량: ");
        for (int i = 0; i < rainfallData.size(); i++) {
            System.out.print(rainfallData.get(i) + " ");
            totalRainfall += rainfallData.get(i);
        }

        // 평균 계산 및 출력
        double averageRainfall = (double) totalRainfall / rainfallData.size();
        System.out.println("\n현재 평균: " + averageRainfall);
    }
}
