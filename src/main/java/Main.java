/**
 * Варіант - 16
 * Завдання 6,11,16,21,25
 */
public class Main {
    public static void main(String[] args) throws Exception{
        var taskExecute = args[0];
        switch (taskExecute) {
            case "task6" -> Task6.execute(args);
            case "task11" -> Task11.execute(args);
            case "task16" -> Task16.execute(args);
            case "task21" -> Task21.execute(args);
            case "task25" -> Task25.execute(args);
            default -> {
                throw new Exception("No specific task argument passed");
            }
        }
    }
}
