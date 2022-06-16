import org.junit.Assert;
import org.junit.Test;

public class TestSuite {
    @Test
    public void task441test() {
        double actual;
        actual = Methods.task4411(11.13);
        Assert.assertEquals(18.1300, actual, 0.0001);
        actual = Methods.task4411(-7919);
        Assert.assertEquals(-7912, actual, 0.0001);
        actual = Methods.task4411(0);
        Assert.assertEquals(7.0000, actual, 0.0001);

    }

    @Test
    public void task2790test() {
        double actual;
        actual = Methods.task2790(6997);
        Assert.assertEquals(0.9205, actual, 0.0001);

    }

//    @Test
//    public void task3946() {
//        double data;
//        data = Methods.task3946(new int[]{1, 2, 3, 4, 1, 3, 4, 4, 4, 4});
//        Assert.assertEquals(3.000000, data, 0.0001);

//    }

    @Test
    public void task5662() {
        double data;
        data = Methods.task5662(1, 2, 3);
        Assert.assertEquals(-8, data, 0.0001);
        data = Methods.task5662(11, 13, 19);
        Assert.assertEquals(-667, data, 0.0001);
        data = Methods.task5662(3, 17, 5);
        Assert.assertEquals(229, data, 0.0001);
        data = Methods.task5662(0, 7, 13);
        Assert.assertEquals(0, data, 0.0001);
        data = Methods.task5662(1, 2, 1);
        Assert.assertEquals(0.0, data, 0.0001);
    }

    @Test
    public void task3669() {
        double data;
        data = Methods.task3669(8, 13);
        Assert.assertEquals(1235520, data, 0.0001);
        data = Methods.task3669(13, 8);
        Assert.assertEquals(1235520, data, 0.0001);
        data = Methods.task3669(159, 161);
        Assert.assertEquals(4095840, data, 0.0001);
        data = Methods.task3669(648, 648);
        Assert.assertEquals(648, data, 0.0001);
        data = Methods.task3669(-2, 600);
        Assert.assertEquals(0, data, 0.0001);
        data = Methods.task3669(35, 24);
        Assert.assertEquals(399703747322880000l, data, 0.0001);


    }

    @Test
    public void task4283() {
        double data;
        data = Methods.task4283("e", new String[]{"q", "w", "e", "r", "q", "w",});
        Assert.assertEquals(1, data, 0.0001);
        data = Methods.task4283("t", new String[]{"q", "w", "e", "r", "q", "w", "e", "r", "q", "w", "e"});
        Assert.assertEquals(0, data, 0.0001);
        data = Methods.task4283("w", new String[]{"e", "w", "w", "w", "w", "w",});
        Assert.assertEquals(5, data, 0.0001);
        data = Methods.task4283("q", new String[]{"r", "r", "r", "r", "r", "r",});
        Assert.assertEquals(0, data, 0.0001);
    }

    @Test
    public void task6497() {
        double[] data;
        double[] expected = {4.6250, 3.6250, 4.6250, 3.3750, 3.3750, 0.6250, 3.3750, 3.3750};
        data = Methods.task6497(new int[]{9, 8, 9, 1, 1, 5, 1, 1,});
        Assert.assertArrayEquals(expected, data, 0.0001);

    }

    @Test
    public void task9774() {
        double[] data = {9, 8, 7, 6, 5, 4,};
        double[] expected = {279, 248, 217, 186, 155, 124};
        double m;
        Methods.task9774(31, data);
        Assert.assertArrayEquals(expected, data, 0.0001);

    }

    @Test
    public void task4411_2() {
        double y = 11.13;
        Methods.task4411_2(y);
        Assert.assertEquals(18.1300, y, 0.0001);
    }

    @Test
    public void task4411_3() {
        Double y = new Double(11.13);
        Methods.task4411_3(y);
        Assert.assertEquals(18.1300, y, 0.0001);
    }

    @Test
    public void task4847() {
        boolean x;
        x = Methods.task4847(13, 17, 14);
        Assert.assertFalse(x);
        x = Methods.task4847(21, 21, 37);
        Assert.assertTrue(x);
        x = Methods.task4847(29, 2, 29);
        Assert.assertTrue(x);
        x = Methods.task4847(61, 47, 47);
        Assert.assertTrue(x);
        x = Methods.task4847(211, 211, 211);
        Assert.assertTrue(x);
        x = Methods.task4847(-151, 239, 239);
        Assert.assertFalse(x);
        x = Methods.task4847(193, -193, 3);
        Assert.assertFalse(x);
        x = Methods.task4847(101, 83, -101);
        Assert.assertFalse(x);
    }

    @Test
    public void task9271(){
        double [] data = {5, 4, 6, 2, 3, 1};
       double[] expected = {4, 3, 5, 1, 2, 0};
        Methods.task9271(data);
        Assert.assertArrayEquals(expected,data, 0.001);
        double [] x = {1, 2, 3, 4,1, 2};
        double[] y = {0, 1, 2, 3, 0, 1};
        Methods.task9271(x);
        Assert.assertArrayEquals(y,x, 0.001);
        double [] a = {3,4, 1, 2, 3, 4, 1, 2, 3, 1, 2};
        double[] b = {2,3,0 ,1, 2, 3, 0, 1, 2, 0, 1};
        Methods.task9271(a);
        Assert.assertArrayEquals(b,a, 0.001);
        double [] d = {4, 2, 3, 4, 3, 2};
        double[] c = {2, 0, 1, 2, 1, 0};
        Methods.task9271(d);
        Assert.assertArrayEquals(c,d, 0.001);
        double [] n = {4, 4, 4, 4, 4, 3, 2, 1};
        double[] m = {3, 3, 3, 3, 3, 2, 1, 0};
        Methods.task9271(n);
        Assert.assertArrayEquals(m,n, 0.001);
        double [] i= {4, 4, 4, 4};
        double[] o = {0, 0, 0, 0};
        Methods.task9271(i);
        Assert.assertArrayEquals(o,i, 0.001);
        double [] p = {4,3};
        double[] l= {1,0};
        Methods.task9271(p);
        Assert.assertArrayEquals(l,p, 0.001);
    }

    @Test
    public void task1934(){
        double data;
       data = Methods.task1934(6047, 6011);
        Assert.assertEquals(0, data, 0.0001);
    }

}