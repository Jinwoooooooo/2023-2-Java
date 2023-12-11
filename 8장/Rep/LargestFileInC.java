package assignment7;

import java.io.File;

public class LargestFileInC {
    public static void main(String[] args) {
        File cDrive = new File("C:\\");

        if (cDrive.exists() && cDrive.isDirectory()) {
            File largestFile = findLargestFile(cDrive);

            if (largestFile != null) {
                System.out.println("가장 큰 파일: " + largestFile.getName());
                System.out.println("크기: " + largestFile.length() + " 바이트");
            } else {
                System.out.println("C 드라이브에 파일이 없습니다.");
            }
        } else {
            System.out.println("C 드라이브를 찾을 수 없습니다.");
        }
    }

    private static File findLargestFile(File directory) {
        File[] files = directory.listFiles();
        File largestFile = null;
        long maxSize = 0;

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.length() > maxSize) {
                    maxSize = file.length();
                    largestFile = file;
                }
            }
        }

        return largestFile;
    }
}
