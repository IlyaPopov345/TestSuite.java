import java.util.Scanner;

public class task14test {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(",");
        int[] num = new int[arr.length];
        int sum = 0;
        int val;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        sum = num[0] + num[1];
        val=num[2];
        num[2] = sum;
        num[3] = val;


       for (int y = 0; y < num.length; y++) {
          System.out.print(num[y]+ " ");}


    }
}

