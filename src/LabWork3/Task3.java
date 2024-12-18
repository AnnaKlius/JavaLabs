package LabWork3;

public class Task3 {
    public static void main(String[] args) {
        try {
            System.out.println(calculateInfiniteSum(0.001)); // ε = 0.001
            System.out.println(calculateInfiniteSum(-0.01)); // ε < 0 (помилка)
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("ε має бути додатнім числом");
        }

        double sum = 0;
        int i = 1;
        double term;
        while (true) {
            term = 1.0 / (i * i);
            if (term < epsilon) {
                break;
            }
            sum += term;
            i++;
        }
        return sum;
    }
}
