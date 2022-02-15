import org.junit.*;


public class Task6Test {
    @Test
    public void hasOneLocalMinimum(){
        var results = Task6.getMinimum(new int[]{1});
        Assert.assertSame(1,results.get(0));
    }

    @Test
    public void hasNoLocalMinimum(){
        var results = Task6.getMinimum(new int[]{});
        Assert.assertSame(true,results.isEmpty());
    }


    @Test
    public void hasFirstElementLocalMinimum(){
        var results = Task6.getMinimum(new int[]{1,2});
        Assert.assertSame(1,results.get(0));
    }

    @Test
    public void hasNotFirstElementLocalMinimum(){
        var results = Task6.getMinimum(new int[]{2,2});
        Assert.assertSame(true,results.isEmpty());
    }

    @Test
    public void isLastElementLocalMinimum(){
        var results = Task6.getMinimum(new int[]{2,1});
        Assert.assertSame(1,results.get(1));
    }

    @Test
    public void isLastElementNotLocalMinimum(){
        var results = Task6.getMinimum(new int[]{2,2});
        Assert.assertSame(true,results.isEmpty());
    }

    @Test
    public void hasMultipleLocalMinimums(){
        var results = Task6.getMinimum(new int[]{1,9,3,9,8});
        Assert.assertSame(1,results.get(0));
        Assert.assertSame(3,results.get(2));
        Assert.assertSame(8,results.get(4));
        Assert.assertSame(3,results.size());
    }



}
