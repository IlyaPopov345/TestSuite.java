import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.omg.PortableInterceptor.ObjectReferenceFactory;

import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab19_15_Map {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();
        String[] arr = temp.split(" ");
// String - тип индекса.
// Integer - тип значения.

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int y = 0; y < arr.length; y++) {
            String t = arr[y];

            if (map.containsKey(t)) { //  Истина если на индексе t присутсвует элемент
                System.out.println(" Элемент существует " + t);
                int count = map.get(t); // Получаем элемент по индекусу t.
                count++;
                map.put(t, count); // Записываем элемент count на индекс t.
            } else {
                System.out.println(" Новый элемент " + t);
                map.put(t, 1); // Записываем элемент 1 на индекс t.

            }
        }
        Object[] indexes = map.keySet().toArray(); // Получил список индексов (ключей) из map
        Object v;
        for (int y = 0; y < indexes.length; y++) {
            v = indexes[y];
            // вывожу на экран инедкс и соотвествующий элемент.
            System.out.println(v + " " + map.get(v));
        }


    }
}

