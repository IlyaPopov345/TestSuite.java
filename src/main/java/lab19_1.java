import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab19_1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        List<String> list = new ArrayList<String>();
        list.add(first);
        System.out.println(list.size());
        String second = s.nextLine();
        if (list.contains(second)){
            System.out.println("ТАкой элемент уже есть");
        }

        list.add(second);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
