import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 16.	Виведіть на дисплей значення тих елементів масивів a і b,
 * які є тільки в одному з масивів, і відсутні в іншому масиві
 * (передбачається, що і масив a, і масив b є множинами,
 * тобто кожен з них не містить елементів з однаковими значеннями )
 */
public class Task16 {

    public static void execute(String[] args) {
        System.out.println("Task 16: Input first array ->");
        var firstNumbers = Task16.inputNumbers();
        System.out.println("Task 16: Input second array ->");
        var secondNumbers = Task16.inputNumbers();
        var symmetricDifference = Task16.symmetricDifference(firstNumbers, secondNumbers);
        System.out.println("Task 16: Symmetric difference: " + symmetricDifference);
    }

    public static Set<Integer> inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Task 16:    Enter size of array ");
        int size = scanner.nextInt();
        System.out.print("Task 16:    Enter " + size + " number(s) ");
        int[] numbers = IntStream.range(0, size).toArray();
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        return Arrays.stream(numbers).boxed().collect(Collectors.toSet());
    }

    public static Set<Integer> symmetricDifference(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> symmetricDiff = new HashSet<>(s1);
        symmetricDiff.addAll(s2);
        Set<Integer> tmp = new HashSet<>(s1);
        tmp.retainAll(s2);

        symmetricDiff.removeAll(tmp);
        return symmetricDiff;
    }


}
