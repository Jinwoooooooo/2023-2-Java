package assignment;

public class Chapter3N7 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        double sum = 0;

        // 1에서 10까지 범위의 랜덤한 정수 생성 및 배열에 저장
        System.out.print("랜덤한 정수들: ");
        for (int j = 0; j < 10; j++) {
            int i = (int) (Math.random() * 10 + 1);
            numbers[j] = i;
            System.out.print(i + " ");
            sum += i;
        }

        // 평균 계산
        double average = sum / 10.0;

        System.out.println("\n평균은 " + average);
    }
}

