package assignment7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneSearchProgram {
    public static void main(String[] args) {
        // 전화번호를 저장할 Map 객체
        Map<String, String> phoneBook = new HashMap<>();

        // 파일에서 데이터 읽어오기
        try (BufferedReader reader = new BufferedReader(new FileReader("c:\\temp\\phone.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+", 2); // 공백을 기준으로 이름과 전화번호를 나눔
                if (parts.length == 2) {
                    phoneBook.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일을 읽는 중에 오류가 발생했습니다.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        // 사용자에게 이름 입력받기
        while (true) {
            System.out.print("이름 >> ");
            String name = scanner.nextLine();

            if (name.equals("그만")) {
                break;
            }

            // 전화번호 찾기
            String phoneNumber = phoneBook.get(name);

            // 결과 출력
            if (phoneNumber != null) {
                System.out.println(phoneNumber);
            } else {
                System.out.println("찾는 이름이 없습니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
