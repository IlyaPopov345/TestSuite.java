import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab13Task1934 {

    public static void main(String[] args) {

        System.out.println("Начало работы программы");
        try {
            Lab13Task1934.step1934();
            System.out.println("Программа завершена успешно");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Подкоренное выражение должно быть неотрицательно");
        }
        catch (InputMismatchException r) {
            System.out.println("Не удалось преобразовать строку в число");
        }

    }

    public static void step1934() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значения А и В ");

            double a = s.nextInt();
            double b = s.nextInt();

            double result;
            result = Methods.task1934(a, b);
            System.out.println(" Результат равен " + result);

    }
}
