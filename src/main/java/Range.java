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

    public static boolean hasIntersection(Range from, Range to) {

        Range redA = new Range(), redB = new Range(), greenA = new Range(), greenB = new Range();

        if (redA.from > redB.to) {
            IllegalArgumentException x = new IllegalArgumentException("Некорректный интервал. Левая граница должна быть меньше правой.");
            throw x;
        }
        if (greenA.from > redB.to) {
            IllegalArgumentException r = new IllegalArgumentException("Некорректный интервал. Левая граница должна быть меньше правой.");
            throw r;
        }
        if (redB.from > greenA.to) {
            System.out.println("Интервалы не пересекаются. Правый край красного левее левого края зеленого.");
            return false;
        }
        if (redA.from < greenB.to && redB.from > greenA.to) {
            System.out.println("Интервалы пересекаются");

        }
        if (greenB.from < redA.to) {
            System.out.println("не пересекаются. Правый край зеленого левее левого края красного");
            return false;
        }
        return true;
    }

    public boolean intersects(int a, int b) {
        boolean result;
        result = Range.hasIntersection(this.from, this.to, a, b);
        return result;
    }
}
