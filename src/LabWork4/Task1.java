package LabWork4;

public class Task1 {

    public static int findDifference(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути null або порожнім.");
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 8, -2, 5, 10};
        int[] array2 = {-1, -10, -3};
        int[] array3 = {};

        System.out.println(findDifference(array1)); // Очікується: 12
        System.out.println(findDifference(array2)); // Очікується: 9

        try {
            System.out.println(findDifference(array3)); // Очікується помилка
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
