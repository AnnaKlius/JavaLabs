package LabWork3;

public class TestLab3 {
    public static void main(String[] args) {
        double sum = 0;
        int k = 30;
        int a = 1;
        int b = 2;
        for (int i = 1; i < k; i++) {
            sum += Math.sqrt(a * i * Math.sqrt(b / i));
        }
        System.out.println(sum);
    }
}
