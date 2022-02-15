import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Example:
 * a = [5,13,8,23,28]
 * b = [3,2,1,4,5]
 * k = 5
 * c = 3
 * Index 0: 5 == 5 * 3 + 3, FALSE
 * Index 1: 13 == 5 * 2 + 3, TRUE
 * Index 2: 3 == 5 * 1 + 3, TRUE
 * Index 3: 23 == 5 * 4 + 3, TRUE
 * Index 4: 28 == 5 * 5 + 3, TRUE
 */

public class Task21Test {

    @Test
    public void noIndexes() {
        var indexes = Task21.getLinearCombinations(3, new int[]{1, 2, 3}, new int[]{3, 4, 5});
        Assert.assertEquals(new ArrayList<>(List.of()), indexes);
    }

    @Test
    public void fourIndexes() {
        var indexes = Task21.getLinearCombinations(5, new int[]{5, 13, 8, 23, 28}, new int[]{3, 2, 1, 4, 5});
        Assert.assertEquals(new ArrayList<>(List.of(1, 2, 3, 4)), indexes);
    }

    @Test
    public void oneIndex() {
        var indexes = Task21.getLinearCombinations(4, new int[]{6, 2, 19, 4}, new int[]{1, 2, 3, 4});
        Assert.assertEquals(new ArrayList<>(List.of(2)), indexes);
    }
}
