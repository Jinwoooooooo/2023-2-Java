package assignment;

import java.util.Scanner;

public class Chapter3N3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
