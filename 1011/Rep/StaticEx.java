package assignment4;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int lengthA = a.length;
        int lengthB = b.length;
        int[] result = new int[lengthA + lengthB];

        for (int i = 0; i < lengthA; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < lengthB; i++) {
            result[lengthA + i] = b[i];
        }

        return result;
    }

    public static void print(int[] a) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" ]");
    }
}

public class StaticEx {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
