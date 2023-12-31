package assignment;

import java.util.Scanner;

public class Chapter3N6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();
        scanner.close();

        System.out.println("== 화폐 단위별 개수 출력 ==");
        for (int i = 0; i < unit.length; i++) {
            int count = money / unit[i]; // 해당 단위의 개수 계산
            money %= unit[i]; // 남은 돈 계산

            if (count > 0) {
                System.out.println(unit[i] + "원 짜리 : " + count + "개");
            }
        }
    }
}
