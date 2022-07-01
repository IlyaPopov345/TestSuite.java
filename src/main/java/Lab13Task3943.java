import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class Lab13Task3943 {

    public static void main(String[] args) {
        System.out.println("Начало работы программы");

        try {
            Lab13Task3943.step3943();
            System.out.println("Конец работы программы");

        } catch (IllegalArgumentException o) {
            System.out.println("Не удалось вычислить результат");
            System.out.println("Подкоренное выражение должно быть неотрицательно");
            System.out.println("Конец работы программы");
        } catch (InputMismatchException r) {
            System.out.println("Не удалось преобразовать строку в число");
            System.out.println("Конец работы программы");
        }

    }

    public static void step3943() {
        Scanner s = new Scanner(System.in);
        System.out.println(" Введите значения X и Y ");
        int x = s.nextInt();
        int y = s.nextInt();
        double result;
        result = Methods.task3934(x, y);
        System.out.println(" Результат равен " + result);

    }
}

