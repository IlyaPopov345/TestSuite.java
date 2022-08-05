import org.junit.Assert;
import org.junit.Test;

import java.lang.IllegalArgumentException;

public class RangeSuite {
    @Test
    public void hasIntersectionIntsTest() {

        boolean data;
        data = Range.hasIntersection(2, 3, 5, 7);
        Assert.assertFalse(data);
        data = Range.hasIntersection(11, 17, 13, 19);
        Assert.assertTrue(data);
        data = Range.hasIntersection(23, 37, 29, 31);
        Assert.assertTrue(data);
        data = Range.hasIntersection(43, 53, 41, 47);
        Assert.assertTrue(data);
        data = Range.hasIntersection(5, 15, 0, 30);
        Assert.assertTrue(data);
        data = Range.hasIntersection(67, 71, 59, 61);
        Assert.assertFalse(data);

    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongRedTest() {
        Range.hasIntersection(79, 73, 83, 89);
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongGreenTest() {
        Range.hasIntersection(97, 101, 107, 103);
    }

    @Test
    public void hasIntersectionRangesTest() {
        Range left, right;



    }
}
