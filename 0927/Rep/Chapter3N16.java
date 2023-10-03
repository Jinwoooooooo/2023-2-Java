package assignment;

import java.util.Random;
import java.util.Scanner;

public class Chapter3N16 {
    public static void main(String[] args) {
        String[] str = {"가위", "바위", "보"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while (true) {
            int computerChoice = random.nextInt(3);
            System.out.print("가위 바위 보! (또는 그만)>> ");
            String userChoice = scanner.nextLine();

            if (userChoice.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            if (!userChoice.equals("가위") && !userChoice.equals("바위") && !userChoice.equals("보")) {
                System.out.println("가위, 바위, 보 중에서 선택하세요.");
                continue;
            }

            System.out.println("사용자 = " + userChoice + ", 컴퓨터 = " + str[computerChoice]);

            if (userChoice.equals(str[computerChoice])) {
                System.out.println("비겼습니다.");
            } else if ((userChoice.equals("가위") && str[computerChoice].equals("보")) ||
                       (userChoice.equals("바위") && str[computerChoice].equals("가위")) ||
                       (userChoice.equals("보") && str[computerChoice].equals("바위"))) {
                System.out.println("사용자가 이겼습니다.");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }

        scanner.close();
    }
}
