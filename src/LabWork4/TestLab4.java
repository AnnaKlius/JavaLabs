package LabWork4;

import java.util.Arrays;

public class TestLab4 {
    public static void main(String[] args) {
        int[] array = {10, 5, 14, 7, 2, 5, 4};
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement){
                minElement = array[i];
            }
        }

        System.out.println(minElement);
    }
}
