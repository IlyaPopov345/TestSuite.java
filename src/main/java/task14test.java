import java.util.Scanner;

public class task14test {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(",");
        int[] num = new int[arr.length];
        int sum = 0;
        int sum2 = 0;
        int val;
        int val2;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        sum = num[0] + num[1];
        val=num[2];
        val2 = num[2];
        num[2] = sum;

        num[3] = val;
        sum2 = val+ val2;
        num[4]= sum2;
        //9,8,7,6,5,4

       for (int y = 0; y < num.length; y++) {
          System.out.print(num[y]+ " ");}


    }
}

