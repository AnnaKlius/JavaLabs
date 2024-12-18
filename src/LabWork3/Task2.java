package LabWork3;

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println(calculateX(-2, 5)); // t < 0
            System.out.println(calculateX(3, 4));  // t >= 0
            System.out.println(calculateX(3, -1)); // n < 1 (помилка)
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double calculateX(double t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n має бути додатним числом");
        }

        double sum = 0;
        if (t < 0) {
            for (int i = 1; i <= n; i++) {
                sum += t * t * i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                sum += Math.sqrt(t * i);
            }
        }
        return sum;
    }
}
