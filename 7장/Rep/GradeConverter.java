package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> gradesList = new ArrayList<>();

        // 6개의 학점을 입력받아 ArrayList에 저장
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
        for (int i = 0; i < 6; i++) {
            char grade = scanner.next().charAt(0);
            gradesList.add(grade);
        }

        // 학점을 점수로 변환하여 평균 계산
        double totalScore = 0.0;
        for (char grade : gradesList) {
            double score = convertToScore(grade);
            totalScore += score;
        }

        // 평균 출력
        double averageScore = totalScore / gradesList.size();
        System.out.println(averageScore);

        scanner.close();
    }

    // 학점을 점수로 변환하는 메서드
    private static double convertToScore(char grade) {
        switch (grade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            case 'F':
                return 0.0;
            default:
                throw new IllegalArgumentException("유효하지 않은 학점입니다: " + grade);
        }
    }
}
