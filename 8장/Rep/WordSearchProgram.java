package assignment7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 대상 파일명 입력
        System.out.print("대상 파일명 입력>> ");
        String fileName = scanner.nextLine();

        // 파일에서 데이터 읽어오기
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            System.out.println(fileName + " 파일을 읽고 있습니다.");

            // 파일의 각 라인에 대해 검색
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일을 읽는 중에 오류가 발생했습니다.");
            return;
        }

        // 검색할 단어나 문장 입력
        while (true) {
            System.out.print("검색할 단어나 문장>> ");
            String searchWord = scanner.nextLine();

            if (searchWord.equals("그만")) {
                break;
            }

            // 파일에서 검색
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int lineNumber = 1;

                // 파일의 각 라인에 대해 검색
                while ((line = reader.readLine()) != null) {
                    if (line.contains(searchWord)) {
                        System.out.println(lineNumber + ": " + line);
                    }
                    lineNumber++;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("파일을 읽는 중에 오류가 발생했습니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}

