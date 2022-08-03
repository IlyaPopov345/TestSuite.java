import org.junit.Assert;
import org.junit.Test;

public class PointSuite {

    @Test
    public void distanceBetweenValuesTest() {

        double actual = Point.distanceBetween(1, 1, 3, 4);
        Assert.assertEquals(3.6056, actual, 0.0001);
        actual = Point.distanceBetween(-2, 4, 8, -10);
        Assert.assertEquals(17.2046, actual, 0.0001);
        actual = Point.distanceBetween(0, 0, -5, -7);
        Assert.assertEquals(8.6023, actual, 0.0001);
        actual = Point.distanceBetween(0, 0, 0, 0);
        Assert.assertEquals(0, actual, 0.0001);
        actual = Point.distanceBetween(-1, -3, 2, 9);
        Assert.assertEquals(12.3693, actual, 0.0001);
    }

    @Test
    public void distanceBetweenPointsTest() {

        Point src, dest;
        src = new Point(1, 1);
        dest = new Point(3, 4);

        double actual = Point.distanceBetween(src, dest);
        Assert.assertEquals(3.6056, actual, 0.0001);
        src = Point.zero();
        dest = Point.zero();
        actual = Point.distanceBetween(src, dest);
        Assert.assertEquals(0, actual, 0.0001);

        src = Point.zero();
        dest = Point.make(-5, -7);
        actual = Point.distanceBetween(src, dest);
        Assert.assertEquals(8.6023, actual, 0.0001);
        src = new Point(-1, -3);
        dest = new Point(2, 9);
        actual = Point.distanceBetween(src, dest);
        Assert.assertEquals(12.3693, actual, 0.0001);
    }

    @Test
    public void distanceToValuesTest() {
        Point src;
        src = new Point(1, 1);
        double actual = src.distanceTo(3, 4);
        Assert.assertEquals(3.6056, actual, 0.0001);


    }

    @Test
    public void distanceToPointTest() {

        Point src, dest;
        src = new Point(-2, 4);
        dest = new Point(8, -10);
        double actual = src.distanceTo(dest);
        Assert.assertEquals(17.2046, actual, 0.0001);

    }
}
