public class Force {

    double x;
    double y;
    double volume;


    public Force(double px, double py,double v) {
        x = px;
        y = py;
        volume = v;
    }

    public static Force FindResultant(Force a, Force b) {

        double modA, modB, product, angle, dx, dy,eq;
        if (a.volume < 0) {
            IllegalArgumentException r = new IllegalArgumentException("Сила не может быть отрицательной");
            throw r;
        }
        if (b.volume < 0) {
            IllegalArgumentException r = new IllegalArgumentException("Сила не может быть отрицательной");
            throw r;
        }
        modA = Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2));
        modB = Math.sqrt(Math.pow(b.x, 2) + Math.pow(b.y, 2));
        product = a.x * b.x + a.y * b.y;
        angle = Math.acos((product / (modA * modB)));
       dx = a.x + b.x;
        dy = a.y + b.y;
        eq = Math.sqrt((Math.pow(a.volume, 2) + (Math.pow(b.volume, 2) + 2 * a.volume * b.volume * Math.cos(angle))));
        System.out.println(" Xrav = " + dx + " Yrav = " + dy + " value = " +eq);

         Force result;
         result = new Force(dx, dy, eq);
        return result;


    }

}