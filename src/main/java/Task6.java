import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 6.	Визначити значення і індекси локальних мінімумів вихідного одновимірного
 *      масиву a (елемент масиву називається локальним мінімумом,
 *      якщо він строго менше своїх сусідів).
 */
public class Task6 {

    public static void execute(String[] args){
        var numbers = Task6.inputNumbers();
        var results = Task6.getMinimum(numbers);
        Task6.printMinimum(results);
    }

    public static boolean isIndexLocalMinimum(int index,  int[] numbers){
        if (numbers.length == 0){
            return false;
        }
        int current = numbers[index];
        if (numbers.length == 1){
            return true;
        }
        if (index == 0){
            return current < numbers[index+1];
        }
        if (index == numbers.length - 1){
            return current < numbers[index-1];
        }

        int right = numbers[index+1];
        int left = numbers[index-1];

        return current < left && current < right;
    }

    public static HashMap<Integer, Integer> getMinimum(int[] numbers){
        HashMap<Integer,Integer> minimums = new HashMap<>();
        for (int i = 0; i < numbers.length; i += 1) {
            if (isIndexLocalMinimum(i,numbers)){
                minimums.put(i,numbers[i]);
            }
        }
        return minimums;
    }

    public static void printMinimum(HashMap<Integer, Integer> minimums){
        minimums.forEach((index,value)->{
            System.out.println("Task 6: Element value = "+value+" , Index = "+index);
        });
    }

    public static int[] inputNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 6: Enter size of array");
        int size = scanner.nextInt();
        int[] numbers = IntStream.range(0,size).toArray();
        System.out.println("Task 6: Enter "+size+" number(s)");
        for (int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        };
        return numbers;
    }
}
