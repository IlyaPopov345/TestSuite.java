import org.junit.Assert;
import org.junit.Test;

import java.lang.IllegalArgumentException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestSuite {
    @Test
    public void task441test() {
        double actual;
        actual = Methods.task4411(11.13);
        assertEquals(18.1300, actual, 0.0001);
        actual = Methods.task4411(-7919);
        assertEquals(-7912, actual, 0.0001);
        actual = Methods.task4411(0);
        assertEquals(7.0000, actual, 0.0001);

    }

    @Test
    public void task2790test() {
        double actual;
        actual = Methods.task2790(6997);
        assertEquals(0.9205, actual, 0.0001);

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
        assertEquals(-8, data, 0.0001);
        data = Methods.task5662(11, 13, 19);
        assertEquals(-667, data, 0.0001);
        data = Methods.task5662(3, 17, 5);
        assertEquals(229, data, 0.0001);
        data = Methods.task5662(0, 7, 13);
        assertEquals(0, data, 0.0001);
        data = Methods.task5662(1, 2, 1);
        assertEquals(0.0, data, 0.0001);
    }

    @Test
    public void task3669() {
        double data;
        data = Methods.task3669(8, 13);
        assertEquals(1235520, data, 0.0001);
        data = Methods.task3669(13, 8);
        assertEquals(1235520, data, 0.0001);
        data = Methods.task3669(159, 161);
        assertEquals(4095840, data, 0.0001);
        data = Methods.task3669(648, 648);
        assertEquals(648, data, 0.0001);
        data = Methods.task3669(-2, 600);
        assertEquals(0, data, 0.0001);
        data = Methods.task3669(35, 24);
        assertEquals(399703747322880000l, data, 0.0001);


    }

    @Test
    public void task4283() {
        double data;
        data = Methods.task4283("e", new String[]{"q", "w", "e", "r", "q", "w",});
        assertEquals(1, data, 0.0001);
        data = Methods.task4283("t", new String[]{"q", "w", "e", "r", "q", "w", "e", "r", "q", "w", "e"});
        assertEquals(0, data, 0.0001);
        data = Methods.task4283("w", new String[]{"e", "w", "w", "w", "w", "w",});
        assertEquals(5, data, 0.0001);
        data = Methods.task4283("q", new String[]{"r", "r", "r", "r", "r", "r",});
        assertEquals(0, data, 0.0001);
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
        assertEquals(18.1300, y, 0.0001);
    }

    @Test
    public void task4411_3() {
        Double y = new Double(11.13);
        Methods.task4411_3(y);
        assertEquals(18.1300, y, 0.0001);
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
    public void task9271() {
        double[] data = {5, 4, 6, 2, 3, 1};
        double[] expected = {4, 3, 5, 1, 2, 0};
        Methods.task9271(data);
        Assert.assertArrayEquals(expected, data, 0.001);
        double[] x = {1, 2, 3, 4, 1, 2};
        double[] y = {0, 1, 2, 3, 0, 1};
        Methods.task9271(x);
        Assert.assertArrayEquals(y, x, 0.001);
        double[] a = {3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2};
        double[] b = {2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1};
        Methods.task9271(a);
        Assert.assertArrayEquals(b, a, 0.001);
        double[] d = {4, 2, 3, 4, 3, 2};
        double[] c = {2, 0, 1, 2, 1, 0};
        Methods.task9271(d);
        Assert.assertArrayEquals(c, d, 0.001);
        double[] n = {4, 4, 4, 4, 4, 3, 2, 1};
        double[] m = {3, 3, 3, 3, 3, 2, 1, 0};
        Methods.task9271(n);
        Assert.assertArrayEquals(m, n, 0.001);
        double[] i = {4, 4, 4, 4};
        double[] o = {0, 0, 0, 0};
        Methods.task9271(i);
        Assert.assertArrayEquals(o, i, 0.001);
        double[] p = {4, 3};
        double[] l = {1, 0};
        Methods.task9271(p);
        Assert.assertArrayEquals(l, p, 0.001);
    }

    @Test
    public void task1934() {
        double data;
        data = Methods.task1934(6047, -6011);
        assertEquals(1240401.6994881134, data, 0.0001);
    }

    @Test
    public void task9020() {
        double data;
        data = Methods.task9020(0);
        assertEquals(23.4307, data, 0.0001);
        data = Methods.task9020(-9);
        assertEquals(25.0998, data, 0.0001);
        data = Methods.task9020(61);
        assertEquals(0, data, 0.0001);
        data = Methods.task9020(60);
        assertEquals(3, data, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void task9020assertion1() {
        Methods.task9020(62);

    }

    @Test
    public void task5871() {
        double data;
        data = Methods.task5871(5);
        assertEquals(0.707107, data, 0.0001);
        data = Methods.task5871(6);
        assertEquals(0.881127, data, 0.0001);
        data = Methods.task5871(6911);
        assertEquals(1, data, 0.0001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void task5871assertion1() {
        Methods.task5871(0);
    }

    @Test
    public void task7799() {
        double data;
        data = Methods.task7799(5, 45);
        assertEquals(34.671920, data, 0.0001);
        data = Methods.task7799(7297, 30);
        assertEquals(61972.336135, data, 0.0001);
        data = Methods.task7799(10, 90);
        assertEquals(0, data, 0.0001);
        data = Methods.task7799(7, 91);
        assertEquals(0, data, 0.0001);
        data = Methods.task7799(9, 100);
        assertEquals(0, data, 0.0001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void task7799assertion1() {
        Methods.task7799(0, 30);
        Methods.task7799(-10, 5);
    }

    @Test
    public void task9354() {
        double data;
        data = Methods.task9354(7, 1, 3);
        assertEquals(-83.0000, data, 0.0001);
        data = Methods.task9354(7247, 7243, 7229);
        assertEquals(-157093203.0000, data, 0.0001);
        data = Methods.task9354(-11, -13, -17);
        assertEquals(-579.0000, data, 0.0001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void task9354assertion1() {
        Methods.task9354(0, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void task9354assertion2() {
        Methods.task9354(0, 1000, 2000);
    }


    @Test
    public void task5170() {
        double data;
        data = Methods.task5170(6);
        assertEquals(4, data, 0.0001);
        data = Methods.task5170(3219);
        assertEquals(8, data, 0.0001);
        data = Methods.task5170(7);
        assertEquals(2, data, 0.0001);
        data = Methods.task5170(2017);
        assertEquals(2, data, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void task5170assertion1() {
        Methods.task5170(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void task5170assertion2() {
        Methods.task5170(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void task5170assertion3() {
        Methods.task5170(-10);
    }

    @Test
    public void mixLiquids() {

        LiquidPortion first, second, data;
        first = new LiquidPortion();
        second = new LiquidPortion();
        first.volume = 1;
        first.temperature = 30;
        second.volume = 3;
        second.temperature = 20;
        data = Methods.mixLiquids(first, second);
        Assert.assertEquals(22.5, data.temperature, 0.0001);
        Assert.assertEquals(4, data.volume, 0.0001);
    }

    @Test
    public void FindResultant() {

        Force first, second, data;
        first = new Force(-50, -86.6025, 100);
        second = new Force(60, 0, 100);
        data = Force.FindResultant(first, second);
        Assert.assertEquals(10, data.x, 0.0001);
        Assert.assertEquals(-86.6025, data.y, 0.0001);
        Assert.assertEquals(100, data.volume, 0.0001);

        first = new Force(10, 0, 40);
        second = new Force(0, 10, 30);
        data = Force.FindResultant(first, second);
        Assert.assertEquals(10, data.x, 0.0001);
        Assert.assertEquals(10, data.y, 0.0001);
        Assert.assertEquals(50, data.volume, 0.0001);

        first.x = 11;
        second.x = 7;
        first.y = 13;
        second.y = 17;
        first.volume = 50;
        second.volume = 30;
        data = Force.FindResultant(first, second);
        Assert.assertEquals(18, data.x, 0.0001);
        Assert.assertEquals(30, data.y, 0.0001);
        Assert.assertEquals(79.0916, data.volume, 0.0001);

        first.x = -70.7106;
        second.x = 60;
        first.y = 50;
        second.y = 0;
        first.volume = 100;
        second.volume = 100;
        data = Force.FindResultant(first, second);
        Assert.assertEquals(-10.7106, data.x, 0.0001);
        Assert.assertEquals(50, data.y, 0.0001);
        Assert.assertEquals(60.5811, data.volume, 0.0001);

        first.x = -86.6025;
        second.x = 60;
        first.y = 50;
        second.y = 0;
        first.volume = 100;
        second.volume = 100;
        data = Force.FindResultant(first, second);
        Assert.assertEquals(-26.6025, data.x, 0.0001);
        Assert.assertEquals(50, data.y, 0.0001);
        Assert.assertEquals(51.7638, data.volume, 0.0001);


        first.x = 3;
        second.x = 4;
        first.y = 4;
        second.y = 3;
        first.volume = 1;
        second.volume = 1;
        data = Force.FindResultant(first, second);
        Assert.assertEquals(7, data.x, 0.0001);
        Assert.assertEquals(7, data.y, 0.0001);
        Assert.assertEquals(1.9799, data.volume, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FindResultant2() {
        Force first, second, data;
        first = new Force(5, 7, 11);
        second = new Force(4, 3, -20);

        data = Force.FindResultant(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FindResultant3() {
        Force first, second, data;
        first = new Force(15, 17, -4);
        second = new Force(19, 13, 5);


        data = Force.FindResultant(first, second);
    }

    @Test
    public void task8418test() {
        List<Integer> expected = Arrays.asList(8, 9, 10, 11,12,13,14,15,16,17);
        List<Integer> actual = Methods.task8418(8);
        Assert.assertEquals(expected,actual);

    }
}

