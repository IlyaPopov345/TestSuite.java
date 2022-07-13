public class Point {
    double x;
    double y;

    public Point (double px, double py) {
        x = px;
        y = py;
    }

    public static double distanceBetween(double x, double y, double z, double e) {
        double result;


        result = Math.sqrt(Math.pow(z - x, 2) + Math.pow(e - y, 2));


        return result;
    }

    public static double distanceBetween(Point a, Point b) {
        double result;
        result = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));


        return result;
    }

    public static Point zero() {
        Point instance;
        instance = new Point(0,0);
        return instance;
    }

    public static Point make(double px, double py) {
        Point instance;
        instance = new Point(px,py);



        return instance;
    }

}
