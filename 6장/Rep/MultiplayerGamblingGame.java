package assignment6;

import java.util.Random;
import java.util.Scanner;

public class MultiplayerGamblingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("갬블링 게임에 참여할 선수 숫자>> ");
        int playerCount = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        Person[] players = new Person[playerCount];
        for (int i = 0; i < playerCount; i++) {
            System.out.print((i + 1) + "번째 선수 이름>> ");
            String playerName = scanner.nextLine();
            players[i] = new Person(playerName);
        }

        playGame(players, scanner);
    }

    private static void playGame(Person[] players, Scanner scanner) {
        Random random = new Random();

        while (true) {
            for (Person player : players) {
                System.out.print("[" + player.getName() + "]:<Enter>");
                scanner.nextLine(); // <Enter> 키 입력 대기

                int[] numbers = {random.nextInt(3) + 1, random.nextInt(3) + 1, random.nextInt(3) + 1};
                printResult(numbers);

                if (checkWin(numbers)) {
                    System.out.println("[" + player.getName() + "]이 이겼습니다!");
                    return; // 게임 종료
                }
            }
        }
    }

    private static void printResult(int[] numbers) {
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] +
                (checkWin(numbers) ? " 축하합니다! " : " 아쉽군요!"));
    }

    private static boolean checkWin(int[] numbers) {
        return numbers[0] == numbers[1] && numbers[1] == numbers[2];
    }

    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
