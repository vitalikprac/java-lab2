import org.junit.Assert;
import org.junit.Test;

public class Task25Test {
    @Test
    public void day1Month1NoLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(1, false);
        Assert.assertEquals(1, dayAndMonth.get(0).intValue());
        Assert.assertEquals(1, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day1Month2NoLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(32, false);
        Assert.assertEquals(1, dayAndMonth.get(0).intValue());
        Assert.assertEquals(2, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day28Month2NoLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(59, false);
        Assert.assertEquals(28, dayAndMonth.get(0).intValue());
        Assert.assertEquals(2, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day29Month2HasLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(60, true);
        Assert.assertEquals(29, dayAndMonth.get(0).intValue());
        Assert.assertEquals(2, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day1Month3NoLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(60, false);
        Assert.assertEquals(1, dayAndMonth.get(0).intValue());
        Assert.assertEquals(3, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day21Month3NoLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(80, false);
        Assert.assertEquals(21, dayAndMonth.get(0).intValue());
        Assert.assertEquals(3, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day21Month3Leap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(81, true);
        Assert.assertEquals(21, dayAndMonth.get(0).intValue());
        Assert.assertEquals(3, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day31Month12NoLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(365, false);
        Assert.assertEquals(31, dayAndMonth.get(0).intValue());
        Assert.assertEquals(12, dayAndMonth.get(1).intValue());
    }

    @Test
    public void day31Month12HasLeap() {
        var dayAndMonth = Task25.getDayAndMonthInYear(366, true);
        Assert.assertEquals(31, dayAndMonth.get(0).intValue());
        Assert.assertEquals(12, dayAndMonth.get(1).intValue());
    }
}
