import java.util.Scanner;

public class task14test {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(",");
        int[] num = new int[arr.length];
        int[] num2 = new int[num.length + 1];
        int sum = 0;

        int val;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        sum = num[0] + num[1];

        num2[2] = sum;

        //9,8,7,6,5,4

        for (int y = 0; y < num2.length; y++) {
            num2 = num;
            System.out.print(num2[y] + " ");
        }


    }
}

