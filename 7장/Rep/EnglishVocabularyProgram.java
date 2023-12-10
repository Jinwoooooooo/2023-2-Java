package assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Word {
    private String english;
    private String korean;

    public Word(String english, String korean) {
        this.english = english;
        this.korean = korean;
    }

    public String getEnglish() {
        return english;
    }

    public String getKorean() {
        return korean;
    }
}

public class EnglishVocabularyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Word> words = new HashMap<>();

        while (true) {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3 >> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    testWords(words);
                    break;
                case 2:
                    insertWord(words);
                    break;
                case 3:
                    System.out.println("\"명품 영어\"를 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }
    }

    private static void testWords(Map<String, Word> words) {
        System.out.println("현재 " + words.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");

        for (Map.Entry<String, Word> entry : words.entrySet()) {
            String englishWord = entry.getKey();
            Word word = entry.getValue();

            System.out.print(englishWord + "?\n(1)" + word.getKorean() + " ");
            int choice = getChoiceFromUser();

            if (choice == -1) {
                System.out.println("테스트를 종료합니다.");
                return;
            }

            if (choice == 1) {
                System.out.println("Excellent!");
            } else {
                System.out.println("No!");
            }
        }
    }

    private static void insertWord(Map<String, Word> words) {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");

        while (true) {
            System.out.print("영어 한글 입력 >> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("그만")) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            String[] splitInput = input.split(" ");
            if (splitInput.length != 2) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }

            String englishWord = splitInput[0].toLowerCase();
            String koreanTranslation = splitInput[1];

            words.put(englishWord, new Word(englishWord, koreanTranslation));
        }
    }

    private static int getChoiceFromUser() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(" :> ");
            String input = scanner.nextLine().trim();

            if (input.equals("-1")) {
                return -1;
            }

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("1부터 4까지의 숫자 중 선택하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
            }
        }
    }
}
