package LabWork5;

public class BubbleSort {

    // Method: Bubble Sort
    public static void bubbleSort(float[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        float[] array = {5.3f, 1.2f, 4.7f, 3.6f, 2.9f};

        System.out.println("Original Array:");
        printArray(array);

        // Test Bubble Sort
        float[] bubbleSortedArray = array.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("\nArray after Bubble Sort:");
        printArray(bubbleSortedArray);
    }

    // Utility method to print an array
    public static void printArray(float[] array) {
        for (float num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
