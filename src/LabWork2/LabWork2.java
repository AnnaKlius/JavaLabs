package LabWork2;

public class LabWork2 {
    public static void main(String[] args) {
        System.out.println("y1 = " + Task1(2.98d, 5.55d, 0.045d, 0.129d));

        System.out.println("y2 = " + Task2(1.27d, 10.99d, 4d, -25.32d));

        System.out.println("y3 = " + Task3(0.478d, -1.26d, 2.68d, 18.24d));
    }

    static double Task1(double a, double b, double c, double d) {
        return (Math.pow(a, b) / Math.cosh(Math.abs(b))) + 4 * (Math.log10(c) / Math.pow(d , (double) 1 / 5));
    }

    static double Task2(double a, double b, double c, double d) {
        return Math.pow(Math.tan(a), (double) 1 / 3) / (2 - Math.sinh(b) / Math.log(Math.abs(d + c)));
    }

    static double Task3(double a, double b, double c, double d) {
        return Math.sin(Math.pow(a, -b)) + 3 * Math.abs(Math.acos(-Math.sqrt(c / d)));
    }
}
