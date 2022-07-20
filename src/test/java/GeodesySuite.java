import org.junit.Assert;
import org.junit.Test;

public class GeodesySuite {


    @Test
    public void distanceBetweenPointsTest() {
        Point srs, dest;
        Direction direction;
        srs = new Point(10, 10);
        dest = new Point(13, 14);
        direction = new Direction();
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 5.0000, direction.distance, 0.0001);
        Assert.assertEquals( 53.1301, direction.angle, 0.0001);

        srs = new Point(24, 4);
        dest = new Point(3, 17);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 24.6982, direction.distance, 0.0001);
        Assert.assertEquals( 148.2405, direction.angle, 0.0001);


        srs = new Point(23, 25);
        dest = new Point(12, 16);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 14.2127, direction.distance, 0.0001);
        Assert.assertEquals( 219.2894, direction.angle, 0.0001);

        srs = new Point(3, 11);
        dest = new Point(13, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 11.6619, direction.distance, 0.0001);
        Assert.assertEquals( 329.0362, direction.angle, 0.0001);

        srs = new Point(5, 5);
        dest = new Point(5, 10);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 5.0000, direction.distance, 0.0001);
        Assert.assertEquals( 90.0000, direction.angle, 0.0001);


        srs = new Point(10, 5);
        dest = new Point(5, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 5.0000, direction.distance, 0.0001);
        Assert.assertEquals( 180.0000, direction.angle, 0.0001);



        srs = new Point(5, 10);
        dest = new Point(5, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 5.0000, direction.distance, 0.0001);
        Assert.assertEquals( 270.0000, direction.angle, 0.0001);


        srs = new Point(5, 5);
        dest = new Point(10, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals( 5.0000, direction.distance, 0.0001);
        Assert.assertEquals( 360.0000, direction.angle, 0.0001);

    }


}
