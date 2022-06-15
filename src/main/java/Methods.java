import java.util.Scanner;

public class Methods {
    public static void task1860(String x) {
        System.out.println(" Мы стремимся к " + x);
    }


    public static void task4140(String x, String y) {
        System.out.println(" Меня зовут  " + x + "," + x + y + ".");
    }

    public static double task4411(double x) {
        return x + 7;

    }

    public static double task2790(double xDeg) {
        double xRad = (xDeg * Math.PI / 180);
        return Math.sqrt(1 - Math.sin(xRad) * Math.sin(xRad));
    }

    public static double task3946(int[] num) {

        int sum = 0;
        int x = 0;

        for (int y = 0; y < num.length; y++) {
            sum = (sum + y);
        }
        x = (sum / num.length);
        return x;
    }

    public static double task5662(double a, double b, double c) {
        double d = 0;
        if (a == 0) {
            System.out.println(" Уравнение не является квадратным ");
            return 0;
        } else {
            d = b * b - 4 * a * c;
        }


        if (d == 0) {
            System.out.println("у уравнения один вещественный корень. ");
        } else if (d < 0) {
            System.out.println("у уравнения нет вещественных корней. ");
        } else if (d > 0) {
            System.out.println("у уравнения два вещественных корня. ");
        }

        return d;
    }

    public static long task3669(int a, int b) {
        long p = 1;
        if (a <= b) {
            for (int y = a; y <= b; y++) {

                p = p * y;
            }
        } else if (a >= b) {

            for (int y = a; y >= b; y--) {

                p = p * y;
            }
        }
        return p;
    }

    public static int task4283(String a, String[] mas) {

        int c = 0;
        int count = 0;
        for (int y = 0; y < mas.length; y++) {
            if (a.equals(mas[y])) {
                if (c == 0) {

                    count++;
                }
            }
        }
        return count;
    }

    public static double task6497(int[] mas) {


        double sum = 0;
        double x = 0;
        double average = 0;

        for (int y = 0; y < mas.length; y++) {
            sum = sum + mas[y];
        }

        x = ((sum) / mas.length);

        for (int y = 0; y < mas.length; y++) {
            average = Math.abs(mas[y] - x);

        }
        return average;
    }

    public static void task2632(int cx, int cy, int r, String fill) {
        System.out.println(" <circle cx= " + "'" + cx + "'" + " cy= " + "'" + cy + "'"
                + " r= " + "'" + r + "'" + " fill= " + "'" + fill + "'");

    }

    public static void task7474(int a, int b, int c) {

        System.out.println("Квадратное уравнение " + a + "*" + "x*x" + " + " + b + "*x" + " + " + c + " =  0");
        System.out.println("Его дискриминант вычисляется по формуле:" + " d = " + b + "*" + b + " - " + "4" + "*" + a + "*" + c);

    }
}