package LabWork4;

public class Task3 {

    public static int[] transform(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути null або порожнім.");
        }

        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) min = num;
        }

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (min != 0) ? array[i] / min : -10;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {6, 12, -3, 9};
        int[] array2 = {0, 0, 0};
        int[] array3 = {};

        try {
            for (int num : transform(array1)) {
                System.out.print(num + " ");
            }
            System.out.println();

            for (int num : transform(array2)) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println(transform(array3)); // Очікується помилка
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}