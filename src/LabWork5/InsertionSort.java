package LabWork5;

public class InsertionSort {

    // Method: Insertion Sort
    public static void insertionSort(float[] array) {
        for (int i = 1; i < array.length; i++) {
            float key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        float[] array = {5.3f, 1.2f, 4.7f, 3.6f, 2.9f};

        System.out.println("Original Array:");
        printArray(array);

        // Test Insertion Sort
        float[] insertionSortedArray = array.clone();
        insertionSort(insertionSortedArray);
        System.out.println("\nArray after Insertion Sort:");
        printArray(insertionSortedArray);
    }

    // Utility method to print an array
    public static void printArray(float[] array) {
        for (float num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}