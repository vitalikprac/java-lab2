import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task16Test {
    public Set<Integer> createSet(Integer... params) {
        return new HashSet<>(Arrays.asList(params));
    }

    @Test
    public void allElements() {
        var results = Task16.symmetricDifference(
                createSet(1, 2, 3),
                createSet(4, 5, 6));
        Assert.assertEquals(createSet(1, 2, 3, 4, 5, 6), results);
    }

    @Test
    public void noElements() {
        var results = Task16.symmetricDifference(
                createSet(1, 2, 3),
                createSet(3, 2, 1));
        Assert.assertEquals(createSet(), results);
    }

    @Test
    public void onlyFirstArrayElements() {
        var results = Task16.symmetricDifference(
                createSet(1, 2, 3),
                createSet(3));
        Assert.assertEquals(createSet(1, 2), results);
    }

    @Test
    public void onlySecondArrayElements() {
        var results = Task16.symmetricDifference(
                createSet(3),
                createSet(3, 4, 5));
        Assert.assertEquals(createSet(4, 5), results);
    }

    @Test
    public void bothArrayElementsExceptSome() {
        var results = Task16.symmetricDifference(
                createSet(1, 2, 3, 4),
                createSet(3, 4, 5, 6));
        Assert.assertEquals(createSet(1, 2, 5, 6), results);
    }
}