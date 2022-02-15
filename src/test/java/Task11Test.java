import org.junit.Assert;
import org.junit.Test;

public class Task11Test {
    @Test
    public void hasNoElements() {
        var results = Task11.getUnderOrUpperValues(new int[]{1, 2, 3}, 1, 3);
        Assert.assertSame(true, results.isEmpty());
    }

    @Test
    public void hasNoElementsWithEmptyInput() {
        var results = Task11.getUnderOrUpperValues(new int[]{}, 1, 3);
        Assert.assertSame(true, results.isEmpty());
    }

    @Test
    public void hasUnderElements() {
        var results = Task11.getUnderOrUpperValues(new int[]{1, 2, 3, 4, 5}, 3, 5);
        Assert.assertSame(1, results.get(0));
        Assert.assertSame(2, results.get(1));
        Assert.assertSame(2, results.size());
    }

    @Test
    public void hasUpperElements() {
        var results = Task11.getUnderOrUpperValues(new int[]{3, 4, 5, 6, 7, 8}, 3, 5);
        Assert.assertSame(6, results.get(3));
        Assert.assertSame(7, results.get(4));
        Assert.assertSame(8, results.get(5));
        Assert.assertSame(3, results.size());
    }

    @Test
    public void hasUnderAndUpperElements() {
        var results = Task11.getUnderOrUpperValues(new int[]{1, 2, 3, 4, 5, 6}, 3, 4);
        Assert.assertSame(1, results.get(0));
        Assert.assertSame(2, results.get(1));
        Assert.assertSame(5, results.get(4));
        Assert.assertSame(6, results.get(5));
        Assert.assertSame(4, results.size());
    }

}