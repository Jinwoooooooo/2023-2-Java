package assignment;

import java.util.Scanner;

public class Chapter3N14 {
    public static void main(String[] args) {
        String[] courses = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] scores = {95, 88, 76, 62, 55};
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("과목 이름>> ");
            String input = scanner.nextLine();
            
            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            boolean found = false;
            for (int i = 0; i < courses.length; i++) {
                if (input.equals(courses[i])) {
                    System.out.println(input + "의 점수는 " + scores[i]);
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("없는 과목입니다.");
            }
        }
        
        scanner.close();
    }
}
