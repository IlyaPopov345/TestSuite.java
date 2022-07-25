import java.lang.IllegalArgumentException;

public class Range {


    int from;
    int to;

    public static boolean hasIntersection(int redA, int redB, int greenA, int greenB) {


        if (redA > redB) {
            IllegalArgumentException x = new IllegalArgumentException("Некорректный интервал. Левая граница должна быть меньше правой.");
            throw x;
        }
        if (greenA > greenB) {
            IllegalArgumentException r = new IllegalArgumentException("Некорректный интервал. Левая граница должна быть меньше правой.");
            throw r;
        }


        if (redB < greenA) {

            System.out.println("Интервалы не пересекаются. Правый край красного левее левого края зеленого.");
            return false;
        }

        if (redA < greenB && redB > greenA) {

            System.out.println("Интервалы пересекаются");

        }
        if (greenB < redA) {
            System.out.println("не пересекаются. Правый край зеленого левее левого края красного");
            return false;
        }


        return true;
    }

    /*public static boolean hasIntersection(Range from, Range to) {


    }
    }
*/
}
