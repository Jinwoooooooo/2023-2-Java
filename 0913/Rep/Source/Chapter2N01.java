package assignment;

import java.util.Scanner;

public class Chapter2N01 {
    public static void main(String[] args) {
        int won;
        double dollar = 1.0 / 1100.0; // 1원당 달러로 환산한 값
        Scanner scn = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원) : ");
        won = scn.nextInt();

        double dollarAmount = won * dollar;

        System.out.println(won + "원은 $" + dollarAmount + "입니다.");
        scn.close();
    }
}
