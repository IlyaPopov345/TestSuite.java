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
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(53.1301, direction.angle, 0.0001);

        srs = new Point(24, 4);
        dest = new Point(3, 17);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals(24.6982, direction.distance, 0.0001);
        Assert.assertEquals(148.2405, direction.angle, 0.0001);


        srs = new Point(23, 25);
        dest = new Point(12, 16);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals(14.2127, direction.distance, 0.0001);
        Assert.assertEquals(219.2894, direction.angle, 0.0001);

        srs = new Point(3, 11);
        dest = new Point(13, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals(11.6619, direction.distance, 0.0001);
        Assert.assertEquals(329.0362, direction.angle, 0.0001);

        srs = new Point(5, 5);
        dest = new Point(5, 10);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(90.0000, direction.angle, 0.0001);


        srs = new Point(10, 5);
        dest = new Point(5, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(180.0000, direction.angle, 0.0001);


        srs = new Point(5, 10);
        dest = new Point(5, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(270.0000, direction.angle, 0.0001);


        srs = new Point(5, 5);
        dest = new Point(10, 5);
        direction = Methods.backwardTask(srs, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(360.0000, direction.angle, 0.0001);

    }

    @Test
    public void forwardTaskTest() {
        Point srs, dest;
        Direction direction;
        direction = new Direction();

        direction.distance = 5;
        direction.angle = 30;
        srs = new Point(1, 1);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(5.3301, dest.getX(), 0.0001);
        Assert.assertEquals(3.5000, dest.getY(), 0.0001);

        direction.distance = 13;
        direction.angle = 110;
        srs = new Point(7, 11);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(2.5537, dest.getX(), 0.0001);
        Assert.assertEquals(23.2160, dest.getY(), 0.0001);

        direction.distance = 23;
        direction.angle = 230;
        srs = new Point(17, 19);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(2.2159, dest.getX(), 0.0001);
        Assert.assertEquals(1.3810, dest.getY(), 0.0001);

        direction.distance = 3;
        direction.angle = 290;
        srs = new Point(29, 31);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(30.0261, dest.getX(), 0.0001);
        Assert.assertEquals(28.1809, dest.getY(), 0.0001);

        direction.distance = 10;
        direction.angle = 90;
        srs = new Point(33, 37);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(33.0000, dest.getX(), 0.0001);
        Assert.assertEquals(47.0000, dest.getY(), 0.0001);

        direction.distance = 10;
        direction.angle = 180;
        srs = new Point(33, 37);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(23.0000, dest.getX(), 0.0001);
        Assert.assertEquals(37.0000, dest.getY(), 0.0001);

        direction.distance = 10;
        direction.angle = 270;
        srs = new Point(33, 37);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(33.0000, dest.getX(), 0.0001);
        Assert.assertEquals(27.0000, dest.getY(), 0.0001);

        direction.distance = 10;
        direction.angle = 360;
        srs = new Point(33, 37);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(43.0000, dest.getX(), 0.0001);
        Assert.assertEquals(37.0000, dest.getY(), 0.0001);

        direction.distance = 10;
        direction.angle = 0;
        srs = new Point(1, 1);
        dest = Methods.forwardTask(srs, direction);
        Assert.assertEquals(11.0000, dest.getX(), 0.0001);
        Assert.assertEquals(1.0000, dest.getY(), 0.0001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void forwardTaskNegativeDistance() {
        Point srs, dest;
        Direction direction;
        direction = new Direction();
        direction.distance = -5;
        direction.angle = 45;
        srs = new Point(1, 1);
        dest = Methods.forwardTask(srs, direction);
    }
    @Test(expected = IllegalArgumentException.class)
    public void  forwardTaskZeroDistance(){
        Point srs, dest;
        Direction direction;
        direction = new Direction();
        direction.distance = 0;
        direction.angle = 45;
        srs = new Point(1, 1);
        dest = Methods.forwardTask(srs, direction);

    }

    @Test(expected = IllegalArgumentException.class)
    public void  forwardTaskNegativeAngle(){
        Point srs, dest;
        Direction direction;
        direction = new Direction();
        direction.distance = 10;
        direction.angle = -5;
        srs = new Point(1, 1);
        dest = Methods.forwardTask(srs, direction);

    }
}