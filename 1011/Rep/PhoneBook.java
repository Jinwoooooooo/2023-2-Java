package assignment4;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

public class PhoneBook {
    private Phone[] phones;
    private int count;

    public PhoneBook(int size) {
        phones = new Phone[size];
        count = 0;
    }

    public void addPhone(String name, String tel) {
        if (count < phones.length) {
            phones[count] = new Phone(name, tel);
            count++;
            System.out.println("저장되었습니다...");
        } else {
            System.out.println("더 이상 저장할 수 없습니다. 최대 용량 초과.");
        }
    }

    public String findPhone(String name) {
        for (int i = 0; i < count; i++) {
            if (phones[i].getName().equals(name)) {
                return phones[i].getTel();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        PhoneBook phoneBook = new PhoneBook(size);

        for (int i = 0; i < size; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            if (parts.length == 2) {
                String name = parts[0];
                String tel = parts[1];
                phoneBook.addPhone(name, tel);
            }
        }

        while (true) {
            System.out.print("검색할 이름>>");
            String searchName = scanner.nextLine();
            if (searchName.equals("그만")) {
                break;
            }
            String tel = phoneBook.findPhone(searchName);
            if (tel != null) {
                System.out.println(searchName + "의 번호는 " + tel + " 입니다.");
            } else {
                System.out.println(searchName + " 이 없습니다.");
            }
        }

        scanner.close();
    }
}
