import java.lang.IllegalArgumentException;
public class Range {
    public static boolean hasIntersection(int redA, int redB, int greenA, int greenB) {


        if (redA > redB) {

            IllegalArgumentException ex = new IllegalArgumentException("Некорректный интервал. Левая граница должна быть меньше правой.");
            throw ex;
        }
        if (greenA > greenB) {
            IllegalArgumentException x = new IllegalArgumentException("Некорректный интервал. Левая граница должна быть меньше правой.");
            throw x;
        }


        if (redA < greenB) {

            System.out.println("Интервалы пересекаются");

        }
        if (redB < greenA) {

            System.out.println("Интервалы не пересекаются. Правый край красного левее левого края зеленого.");
            return false;
        }


        if (greenA < redB) {

            System.out.println("Интервалы пересекаются");

        }

        if (greenB < redA) {

            System.out.println("Интервалы не пересекаются. Правый край красного левее левого края зеленого.");
            return false;
        }



        return true;
    }


}
