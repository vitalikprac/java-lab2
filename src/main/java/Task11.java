import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * 11.	Визначити індекси і значення елементів вихідного одновимірного масиву a,
 *      величини яких лежать поза нижньою amin і верхньою amax границями (ai <amin або ai> amax).
 *      Значення amin і amax задаються як перші два аргументи при виклику програми, інші аргументи - елементи масиву.
 */
public class Task11 {

    public static void execute(String[] args){
        int numbersLength = args.length-3;
        int[] numbers = IntStream.range(0,numbersLength).toArray();
        for (int i = 0;i<numbersLength;i++){
            numbers[i] = Integer.parseInt(args[i+3]);
        }
        var aMin = Integer.parseInt(args[1]);
        var aMax = Integer.parseInt(args[2]);
        var results = Task11.getUnderOrUpperValues(numbers,aMin,aMax);
        Task11.printNumbers(results);
    }

    public static HashMap<Integer, Integer> getUnderOrUpperValues(int[] numbers,int aMin, int aMax){
        HashMap<Integer,Integer> minimums = new HashMap<>();
        for (int i = 0; i < numbers.length; i += 1) {
            if (numbers[i] < aMin || numbers[i] > aMax){
                minimums.put(i,numbers[i]);
            }
        }
        return minimums;
    }

    public static void printNumbers(HashMap<Integer,Integer> numbers){
        numbers.forEach((index,value)->{
            System.out.println("Task 11: Element value = "+value+" , Index = "+index);
        });
    }

}
