import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab19_7 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        Set<String> set = new HashSet<String>();
        set.add(first);
        System.out.println(set.size());
        String second = s.nextLine();
        if (set.contains(second)){
            System.out.println("ТАкой элемент уже есть");
        }
        set.add(second);
        System.out.println(set.size());


    }
}
