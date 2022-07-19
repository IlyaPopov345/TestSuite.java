import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

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

    public static void task4411_2(double x) {

        x = x + 7;
    }

    public static void task4411_3(Double x) {

        x = x + 7;
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

    public static double[] task6497(int[] mas) {


        double sum = 0;
        double x = 0;
        double[] average = new double[mas.length];

        for (int y = 0; y < mas.length; y++) {
            sum = sum + mas[y];
        }

        x = ((sum) / mas.length);

        for (int y = 0; y < mas.length; y++) {
            average[y] = Math.abs(mas[y] - x);

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

    public static void task9774(double m, double[] mas) {
        double x;

        for (int i = 0; i < mas.length; i++) {

            x = mas[i] * m;
            mas[i] = x;
        }
    }

    public static boolean task4847(int a, int b, int c) {
        if (a < 0) {
            System.out.println("Значение A должно быть неотрицательным");
            return false;
        }
        if (b < 0) {
            System.out.println("Значение B должно быть неотрицательным");
            return false;
        }
        if (c < 0) {
            System.out.println("Значение C должно быть неотрицательным");
            return false;
        }

        if (a == b) {

            System.out.println("Треугольник является равнобедренным.");
            return true;
        }
        if (b == c) {
            System.out.println("Треугольник является равнобедренным.");
            return true;
        }
        if (a == c) {
            System.out.println("Треугольник является равнобедренным.");
            return true;
        } else {

            System.out.println("Треугольник не является равнобедренным.");

            return false;
        }
    }

    public static void task9271(double[] mas) {
        double min;
        double sub = 0;

        min = mas[0];

        for (int y = 1; y < mas.length; y++) {
            if (min > mas[y]) {
                min = mas[y];
            }
        }
        for (int n = 0; n < mas.length; n++) {
            sub = mas[n] - min;
            mas[n] = sub;

            System.out.print(sub + " ");
        }
        System.out.println();

    }

    public static double task1934(double a, double b) {
        double result = 0;

        if (b <= 0) {
            result = a * Math.sqrt(-7 * b);
            System.out.println(result);
        } else {

            IllegalArgumentException ex = new IllegalArgumentException("Подкоренное выражение должно быть неотрицательно");
            throw ex;
        }
        return result;
    }

    public static double task3934(int x, int y) {
        double result;

        result = (-5 * Math.sqrt(x + Math.sqrt(y)));

        if (Double.isNaN(result)) {
            IllegalArgumentException ui = new IllegalArgumentException("Подкоренное выражение должно быть неотрицательно3");
            throw ui;

        }


        return result;
    }

    public static double task9020(int x) {

        double result;
        result = 3 * Math.sqrt(61 - x);

        if (Double.isNaN(result)) {
            IllegalArgumentException ex = new IllegalArgumentException("Подкоренное выражение должно быть неотрицательно");

            throw ex;
        }
        return result;
    }


    public static double task5871(int x) {
        double result;
        result = (Math.sqrt(x + 5) + Math.sqrt(x - 5)) / (2 * Math.sqrt(x));
        if (Double.isNaN(result)) {
            IllegalArgumentException ex = new IllegalArgumentException("Подкоренное выражение должно быть неотрицательно");

            throw ex;
        }
        return result;
    }


    public static double task7799(int mass, int aDeg) {
        double result;
        double aRad;
        if (mass <= 0) {
            IllegalArgumentException ex = new IllegalArgumentException("Масса должна быть положительной");
            throw ex;

        } else {
            aRad = aDeg * Math.PI / 180;
            result = mass * 9.8067 * Math.cos(aRad);
        }
        if (result < 0) {
            return 0;

        }

        return result;
    }

    public static double task9354(int a, int b, int c) {
        double result;
        int k = 2;

        if (a == 0) {
            IllegalArgumentException ex = new IllegalArgumentException("Уравнение y =" + a + "x^2" + "+" + b + "x" + c + " не является квадратным ");
            throw ex;
        } else {
            result = (Math.pow(b, k)) - 4 * a * c;
        }
        return result;
    }

    public static int task5170(int y) {
        int result;
        int count = 0;
        if (y <= 1) {
            IllegalArgumentException ex = new IllegalArgumentException("Простое число должно быть больше 1 ");
            throw ex;
        }
        for (int i = 1; i <= y; i++) {
            if ((y % i) == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println(" Число " + y + " без остатка делится на " + count + " других чисел. Число составное ");
        } else if (count <= 2) {
            System.out.println(" Число " + y + " без остатка делится на " + count + " других чисел. Число простое ");
        }
        result = count;

        return result;

    }
    }
/*
 public static  Direction backwardTask(Point x , Point y){

}}
*/




