package assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PointManagementProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> customerPoints = new HashMap<>();

        System.out.println("** 포인트 관리 프로그램입니다 **");

        while (true) {
            System.out.print("이름과 포인트 입력 >> ");
            String name = scanner.next();

            // "그만" 입력 시 종료
            if (name.equals("그만")) {
                break;
            }

            int points = scanner.nextInt();

            // 이름이 이미 존재하는 경우 포인트 누적
            if (customerPoints.containsKey(name)) {
                int currentPoints = customerPoints.get(name);
                customerPoints.put(name, currentPoints + points);
            } else {
                // 이름이 존재하지 않는 경우 새로운 고객 추가
                customerPoints.put(name, points);
            }

            // 현재 상태 출력
            printCustomerPoints(customerPoints);
        }

        scanner.close();
    }

    // 현재 상태 출력 메서드
    private static void printCustomerPoints(Map<String, Integer> customerPoints) {
        System.out.print("현재 상태: ");
        for (Map.Entry<String, Integer> entry : customerPoints.entrySet()) {
            System.out.print("(" + entry.getKey() + ", " + entry.getValue() + ") ");
        }
        System.out.println();
    }
}
