
import java.util.Scanner;
import java.lang.NumberFormatException;

public class task2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int count = 0;
        double x = 0;
        double sum = 0;

        int[] num = new int[arr.length];

        for (int i = 0; i < num.length; i++) {
            try {

                num[i] = Integer.parseInt(arr[i]);
                count++;
            } catch (NumberFormatException a) {
                System.out.println(" Элемент № " + i + " со значением " + arr[i] + " не число ");
            }
            sum = sum + num[i];
        }
            x = (sum / count);
            System.out.print(" " + x);



    }
}


