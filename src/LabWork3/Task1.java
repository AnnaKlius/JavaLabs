package LabWork3;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println(calculateSum(5, 10, 15)); // коректні дані
            System.out.println(calculateSum(3, 4, 31));  // k > 30 (помилка)
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double calculateSum(double a, double b, int k) {
        if (k > 30 || k <= 0) {
            throw new IllegalArgumentException("k має бути у діапазоні [1, 30]");
        }
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("a та b мають бути додатні");
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.sqrt(a * i * Math.sqrt(b / i));
        }
        return sum;
    }
}
