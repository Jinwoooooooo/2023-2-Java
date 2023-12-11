package assignment7;

import java.io.File;
import java.util.Scanner;

public class ExtendedFileExplorer {
    private File currentDir = null;
    private File subFiles[] = null;

    public ExtendedFileExplorer(String dirName) {
        currentDir = new File(dirName);
    }

    private void showSubDirectories() {
        System.out.println("\t[" + currentDir.getPath() + "]");
        subFiles = currentDir.listFiles();
        for (File f : subFiles) {
            System.out.print((f.isFile() ? "file" : "dir"));
            System.out.printf("%-15s", "\t\t" + f.length() + "바이트");
            System.out.println("\t\t" + f.getName());
        }
    }

    private boolean contains(String filename) {
        for (File f : subFiles) {
            if (f.getName().equalsIgnoreCase(filename))
                return true;
        }
        return false;
    }

    private void rename(String oldName, String newName) {
        File oldFile = new File(currentDir, oldName);
        File newFile = new File(currentDir, newName);

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("\t" + oldName + "이(가) " + newName + "(으)로 변경되었습니다.");
            } else {
                System.out.println("\t변경에 실패했습니다.");
            }
        } else {
            System.out.println("\t" + oldName + " 파일 또는 디렉토리가 존재하지 않습니다.");
        }
    }

    private void mkdir(String dirName) {
        File newDir = new File(currentDir, dirName);

        if (newDir.mkdir()) {
            System.out.println("\t" + dirName + " 디렉토리가 생성되었습니다.");
        } else {
            System.out.println("\t디렉토리 생성에 실패했습니다.");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** 확장 파일 탐색기입니다. *****");
        showSubDirectories();

        while (true) {
            System.out.print(">>");
            String command = scanner.nextLine().trim(); // 한 라인을 읽고 앞뒤에 입력한 빈칸 지우기
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("그만")) {
                break; // 프로그램 종료
            } else if (tokens[0].equals("..")) {
                String s = currentDir.getParent();
                if (s == null)
                    continue;
                else {
                    currentDir = new File(currentDir.getParent());
                    showSubDirectories();
                }
            } else if (tokens[0].equals("rename")) {
                if (tokens.length == 3) {
                    rename(tokens[1], tokens[2]);
                    showSubDirectories();
                } else {
                    System.out.println("\t잘못된 명령입니다.");
                }
            } else if (tokens[0].equals("mkdir")) {
                if (tokens.length == 2) {
                    mkdir(tokens[1]);
                    showSubDirectories();
                } else {
                    System.out.println("\t잘못된 명령입니다.");
                }
            } else {
                if (contains(tokens[0])) {
                    if (new File(currentDir, tokens[0]).isDirectory()) {
                        currentDir = new File(currentDir, tokens[0]);
                        showSubDirectories();
                    } else {
                        System.out.println("\t디렉터리가 아닙니다.!");
                    }
                }
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }

    public static void main(String[] args) {
        ExtendedFileExplorer efe = new ExtendedFileExplorer("c:\\");
        efe.run();
    }
}
