package assignment;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int m = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("곱하고자 하는 두 정수 입력>> ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    m = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("실수는 입력하면 안됩니다.");
                    scanner.nextLine(); // 입력 라인 비우기
                }
            } else {
                System.out.println("실수는 입력하면 안됩니다.");
                scanner.nextLine(); // 입력 라인 비우기
            }
        }

        System.out.println(n + " x " + m + " = " + n * m);

        scanner.close();
    }
}
