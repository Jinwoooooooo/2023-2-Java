package assignment7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SystemIniReader {
    public static void main(String[] args) {
        String filePath = "c:\\windows\\system.ini";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println(filePath + " 파일을 읽어 출력합니다.");

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일을 읽을 수 없습니다.");
        }
    }
}
