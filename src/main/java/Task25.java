import java.util.List;

/**
 * 25.	Визначте номер дня у місяці та номер місяця року по заданому номеру дня в році (вводиться як аргумент при виклику програми).
 * Ознака, чи є рік високосним, задається як булевська змінна.
 * Вказівка: кількість днів до початку цього місяця (НЕ високосний рік):
 * січень - 0, лютий - 31, березень - 59, квітень - 90, травень -120, червень - 151,
 * липень - 181, серпень - 212, вересень - 243, жовтень - 273, листопад - 314, грудень - 334
 * задати у вигляді масиву. У високосному році, починаючи з березня, до кількості днів додається 1
 */
public class Task25 {

    public static final int[] MONTH_DAYS = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public static void execute(String[] args) {
        int numberInYear = Integer.parseInt(args[1]);
        boolean isLeap = Boolean.parseBoolean(args[2]);
        var dayAndMonth = getDayAndMonthInYear(numberInYear, isLeap);
        System.out.println("Task 25: Day number: " + dayAndMonth.get(0));
        System.out.println("Task 25: Month number: " + dayAndMonth.get(1));
    }

    public static int getMonthIndex(int day, boolean isLeap) {
        for (int i = MONTH_DAYS.length - 1; i >= 0; i--) {
            int daysInMonth = MONTH_DAYS[i];
            if (isLeap && i > 1) {
                daysInMonth += 1;
            }
            if (daysInMonth < day) {
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> getDayAndMonthInYear(int day, boolean isLeap) {
        int monthNumber = getMonthIndex(day, isLeap) + 1;
        int dayInMonth = day - MONTH_DAYS[monthNumber - 1];
        if (isLeap && monthNumber > 2) {
            dayInMonth--;
        }
        return List.of(dayInMonth, monthNumber);
    }
}
