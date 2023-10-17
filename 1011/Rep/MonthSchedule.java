package assignment4;

import java.util.Scanner;

class Day {
    private String work; // 하루의 할 일을 나타내는 문자열

    public void set(String work) {
        this.work = work;
    }

    public String get() {
        return work;
    }

    public void show() {
        if (work == null)
            System.out.println("없습니다.");
        else
            System.out.println(work + "입니다.");
    }
}

public class MonthSchedule {
    private Day[] days;

    public MonthSchedule(int daysInMonth) {
        days = new Day[daysInMonth];
        for (int i = 0; i < daysInMonth; i++) {
            days[i] = new Day();
        }
    }

    public void input(int day, String work) {
        if (day >= 1 && day <= days.length) {
            days[day - 1].set(work);
            System.out.println(day + "일에 일정이 저장되었습니다.");
        } else {
            System.out.println("유효한 날짜가 아닙니다.");
        }
    }

    public void view(int day) {
        if (day >= 1 && day <= days.length) {
            System.out.print(day + "일의 할 일: ");
            days[day - 1].show();
        } else {
            System.out.println("유효한 날짜가 아닙니다.");
        }
    }

    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이번 달 스케줄 관리 프로그램.");
        while (true) {
            System.out.print("할 일(입력:1, 보기:2, 끝내기:3) >> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("날짜(1~" + days.length + "): ");
                int day = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 처리
                System.out.print("할 일 입력 >> ");
                String work = scanner.nextLine();
                input(day, work);
            } else if (choice == 2) {
                System.out.print("날짜(1~" + days.length + "): ");
                int day = scanner.nextInt();
                view(day);
            } else if (choice == 3) {
                finish();
                break;
            } else {
                System.out.println("올바른 메뉴를 선택하세요.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
        april.run();
    }
}
