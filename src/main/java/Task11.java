
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 11.	Визначити індекси і значення елементів вихідного одновимірного масиву a,
 * величини яких лежать поза нижньою amin і верхньою amax границями (ai <amin або ai> amax).
 * Значення amin і amax задаються як перші два аргументи при виклику програми, інші аргументи - елементи масиву.
 */
public class Task11 {

    public static void execute(String[] args) {
        int numbersLength = args.length - 3;
        int[] numbers = IntStream.range(0, numbersLength).toArray();
        for (int i = 0; i < numbersLength; i++) {
            numbers[i] = Integer.parseInt(args[i + 3]);
        }
        var aMin = Integer.parseInt(args[1]);
        var aMax = Integer.parseInt(args[2]);
        var results = Task11.getUnderOrUpperValues(numbers, aMin, aMax);
        Task11.printNumbers(results);
    }

    public static Map<Integer, Integer> getUnderOrUpperValues(int[] numbers, int aMin, int aMax) {
        return IntStream
                .range(0, numbers.length)
                .boxed()
                .filter(i -> numbers[i] < aMin || numbers[i] > aMax)
                .collect(Collectors.toMap(i -> i, i -> numbers[i]));
    }

    public static void printNumbers(Map<Integer, Integer> numbers) {
        numbers.forEach((index, value) -> {
            System.out.println("Task 11: Element value = " + value + " , Index = " + index);
        });
    }

}
