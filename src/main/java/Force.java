public class Force {

    double x;
    double y;
    double volume;


    public static Force FindResultant(Force a, Force b) {
        Force equally;
        equally = new Force();
        double modA, modB, product, angle;
        if (a.volume<0){
            IllegalArgumentException r = new IllegalArgumentException("Сила не может быть отрицательной");
            throw r;
        }
        if (b.volume<0){
            IllegalArgumentException r = new IllegalArgumentException("Сила не может быть отрицательной");
            throw r;
        }
        modA = Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2));
        modB = Math.sqrt(Math.pow(b.x, 2) + Math.pow(b.y, 2));
        product = a.x * b.x + a.y * b.y;
        angle = Math.acos((product / (modA * modB)));
        equally.x = a.x + b.x;
        equally.y = a.y + b.y;
        equally.volume = Math.sqrt((Math.pow(a.volume, 2) + (Math.pow(b.volume, 2) + 2 * a.volume * b.volume * Math.cos(angle))));
        System.out.println(" Xrav = " + equally.x + " Yrav = " + equally.y + " value = " + equally.volume);
        return equally;


    }

}