package assignment;

public class Add {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            if (isInteger(arg)) {
                int num = Integer.parseInt(arg);
                sum += num;
            }
        }

        System.out.println(sum);
    }

    public static boolean isInteger(String s) {
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
