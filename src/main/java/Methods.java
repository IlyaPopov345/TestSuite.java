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
            if (a.equals(mas[y])) { // mas == arr[0]
                if (c == 0) {

                    count++;
                }
            }
        }
        return count;
    }
}