package assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AppendFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 파일 이름 입력
        System.out.print("첫 번째 파일 이름을 입력하세요>> ");
        String firstFileName = scanner.nextLine();

        // 두 번째 파일 이름 입력
        System.out.print("두 번째 파일 이름을 입력하세요>> ");
        String secondFileName = scanner.nextLine();

        // 새로운 파일 이름
        String newFileName = "appended.txt";

        try (BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFileName));
             BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFileName));
             BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(newFileName))) {

            // 첫 번째 파일의 내용을 새 파일에 쓰기
            String line;
            while ((line = firstFileReader.readLine()) != null) {
                outputFileWriter.write(line + "\n");
            }

            // 두 번째 파일의 내용을 새 파일에 이어서 쓰기
            while ((line = secondFileReader.readLine()) != null) {
                outputFileWriter.write(line + "\n");
            }

            System.out.println("프로젝트 폴더 밑에 " + newFileName + " 파일에 저장하였습니다.");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일을 읽거나 쓰는 중에 오류가 발생했습니다.");
        } finally {
            scanner.close();
        }
    }
}
