

import java.util.Scanner;
import java.util.InputMismatchException;
ublic class xyu {


    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);


    try {
        double result = 0;
        double x = s.nextInt();
        result = x + 7;
        System.out.println(result);
    } catch (InputMismatchException a) {
        System.out.println("Не удалось преобразовать строку в число");

    }

}
}
}
