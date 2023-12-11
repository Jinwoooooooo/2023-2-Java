package assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneReaderEx {
    public static void main(String[] args) {
        File file = new File("c:\\temp\\phone.txt");

        try {
            Scanner fileScanner = new Scanner(file);

            System.out.println(file.getPath() + "를 출력합니다.");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}

