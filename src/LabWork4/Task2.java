package LabWork4;

public class Task2 {

    private static int findSum(int[] array) {
        if (array == null || array.length < 3) {
            throw new IllegalArgumentException("Масив повинен містити щонайменше три елементи.");
        }

        int max = Integer.MIN_VALUE;
        int positiveCount = 0;
        int thirdPositive = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) max = num;
            if (num > 0) {
                positiveCount++;
                if (positiveCount == 3) thirdPositive = num;
            }
        }

        if (positiveCount < 3) {
            throw new IllegalArgumentException("Масив повинен містити щонайменше три додатні елементи.");
        }

        return thirdPositive + max;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 8, 1, 5, 10};
        int[] array2 = {1, -5, 2, 4, 6};
        int[] array3 = {1, 2};

        System.out.println(findSum(array1)); // Очікується: 14 (1 + 10)
        System.out.println(findSum(array2)); // Очікується: 7 (1 + 6)

        try {
            System.out.println(findSum(array3)); // Очікується помилка
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
