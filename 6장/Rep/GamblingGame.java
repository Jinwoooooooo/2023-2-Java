package assignment6;

import java.util.Random;
import java.util.Scanner;

public class GamblingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1번째 선수 이름>> ");
        String player1Name = scanner.nextLine();
        Person player1 = new Person(player1Name);

        System.out.print("2번째 선수 이름>> ");
        String player2Name = scanner.nextLine();
        Person player2 = new Person(player2Name);

        playGame(player1, player2, scanner);
    }

    private static void playGame(Person player1, Person player2, Scanner scanner) {
        Random random = new Random();

        while (true) {
            System.out.print("[" + player1.getName() + "]:<Enter>");
            scanner.nextLine(); // <Enter> 키 입력 대기
            int[] numbers1 = {random.nextInt(3) + 1, random.nextInt(3) + 1, random.nextInt(3) + 1};
            printResult(numbers1);

            System.out.print("[" + player2.getName() + "]:<Enter>");
            scanner.nextLine(); // <Enter> 키 입력 대기
            int[] numbers2 = {random.nextInt(3) + 1, random.nextInt(3) + 1, random.nextInt(3) + 1};
            printResult(numbers2);

            if (checkWin(numbers1) || checkWin(numbers2)) {
                determineWinner(player1, player2, numbers1, numbers2);
                break;
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

    private static void determineWinner(Person player1, Person player2, int[] numbers1, int[] numbers2) {
        if (checkWin(numbers1)) {
            System.out.println("[" + player1.getName() + "]이 이겼습니다!");
        } else {
            System.out.println("[" + player2.getName() + "]이 이겼습니다!");
        }
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
