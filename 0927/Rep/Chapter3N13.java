package assignment;

public class Chapter3N13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            String number = String.valueOf(i);
            boolean Clap = false;

            for (int j = 0; j < number.length(); j++) {
                char digit = number.charAt(j);
                if (digit == '3' || digit == '6' || digit == '9') {
                    System.out.print("박수 ");
                    Clap = true;
                }
            }

            if (Clap) {
                System.out.println("짝");
            } else {
                System.out.println(i);
            }
        }
    }
}

