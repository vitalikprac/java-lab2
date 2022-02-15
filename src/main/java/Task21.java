import java.util.*;
import java.util.stream.IntStream;

/**
 * 21.	Перевірте, чи не є значення i-их елементів масиву a лінійної комбінацією i-их значень елементів масиву b,
 * тобто ai = k * bi + c, де k і c - константи (значення k і c можна визначити зі
 * значень двох перших елементів a і b як два рівняння з двома невідомими).
 */
public class Task21 {
    public static void execute(String[] args) {
        int size = Task21.inputNumbersSize();
        var firstNumbers = Task21.inputNumbers(size);
        var secondNumbers = Task21.inputNumbers(size);
        var linearCombination = getLinearCombinations(size, firstNumbers, secondNumbers);
        System.out.println("Task 21: These specific indexes is linear combination = " + linearCombination);
    }

    public static List<Integer> getLinearCombinations(int size, int[] firstNumbers, int[] secondNumbers) {
        var indexes = new ArrayList<Integer>();
        int k = firstNumbers[0];
        int c = secondNumbers[0];
        for (int i = 0; i < size; i++) {
            if (firstNumbers[i] == k * secondNumbers[i] + c) {
                indexes.add(i);
            }
        }
        return indexes;
    }


    public static int inputNumbersSize() {
        System.out.print("Task 21: Enter size of arrays ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] inputNumbers(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Task 21: Enter " + size + " number(s) ");
        int[] numbers = IntStream.range(0, size).toArray();
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

}
