public class Point {
    double x;
    double y;

    public Point(double px, double py) {
        x = px;
        y = py;
    }

    public double distanceTo(double bx, double by) {
        double result;
        result = Math.sqrt(Math.pow(bx - this.x, 2) + Math.pow(by - this.y, 2));
        return result;
    }

    public double distanceTo(Point b) {

        double result;

        result = Math.sqrt(Math.pow(b.x - this.x, 2) + Math.pow(b.y - this.y, 2));
        return result;
    }

    public static double distanceBetween(double ax, double ay, double bx, double by) {
        double result;
        result = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
        return result;
    }

    public static double distanceBetween(Point a, Point b) {
        double result;
        result = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        return result;
    }

    public static Point zero() {
        Point instance;
        instance = new Point(0, 0);
        return instance;
    }

    public static Point make(double px, double py) {
        Point instance;
        instance = new Point(px, py);


        return instance;
    }


}
