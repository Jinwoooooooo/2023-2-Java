package assignment4;

import java.util.Scanner;

public class Chapter4N02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int eng = scanner.nextInt();
		Grade me = new Grade(math, science, eng);
		System.out.println("평균은 " + me.average());
		
		scanner.close();
	}
}

class Grade {
	private int math;
	private int science;
	private int eng;
	
	public Grade(int math, int science, int eng) {
		this.math = math;
		this.science = science;
		this.eng = eng;
	}
	
	public double average() {
		return (math + science + eng) / 3.0;
	}
	
}
