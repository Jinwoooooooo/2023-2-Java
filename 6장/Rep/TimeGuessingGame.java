package assignment6;

import java.util.Scanner;
import java.util.Calendar;

public class TimeGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        Player player1 = new Player("황기태");
        Player player2 = new Player("이재문");

        playGame(player1, scanner);
        playGame(player2, scanner);

        determineWinner(player1, player2);
    }

    private static void playGame(Player player, Scanner scanner) {
        System.out.print(player.getName() + " 시작 <Enter>키 >> ");
        scanner.nextLine(); // <Enter> 키 입력 대기

        long startTime = getCurrentTimeSeconds();
        System.out.println("\t현재 초 시간 = " + startTime);

        System.out.print("10초 예상 후 <Enter>키 >> ");
        scanner.nextLine(); // <Enter> 키 입력 대기

        long guessedTime = getCurrentTimeSeconds();
        System.out.println("\t현재 초 시간 = " + guessedTime);

        int difference = (int) Math.abs(guessedTime - startTime);
        player.setResult(difference);
    }

    private static long getCurrentTimeSeconds() {
        // Calendar를 이용하여 현재 시간을 초로 변환
        Calendar calendar = Calendar.getInstance();
        return (calendar.getTimeInMillis() / 1000) % 100; //
    }

    private static void determineWinner(Player player1, Player player2) {
        System.out.println(player1.getName() + "의 결과 " + player1.getResult() +
                ", " + player2.getName() + "의 결과 " + player2.getResult());

        if (player1.getResult() < player2.getResult()) {
            System.out.println("승자는 " + player1.getName());
        } else if (player1.getResult() > player2.getResult()) {
            System.out.println("승자는 " + player2.getName());
        } else {
            System.out.println("무승부입니다.");
        }
    }

    static class Player {
        private final String name;
        private int result;

        public Player(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }
    }
}
