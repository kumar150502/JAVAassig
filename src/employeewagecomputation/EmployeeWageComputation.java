package employeewagecomputation;
import java.util.Random;
import java.util.Scanner;
public class EmployeeWageComputation {
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attendance = new Random().nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
            return;
        }

        int wagePerHour = 20;
        int dailyWage = wagePerHour * FULL_DAY_HOURS;

        int partTimeWage = wagePerHour * PART_TIME_HOURS;
        int totalWage = dailyWage + partTimeWage;

        int workingDays = 20;
        int monthlyWage = workingDays * totalWage;

        int totalWorkingHours = 100;
        int totalWorkingDays = 20;
        int currentWorkingHours = 0;
        int currentWorkingDays = 0;
        while (currentWorkingHours < totalWorkingHours || currentWorkingDays < totalWorkingDays) {
            if (currentWorkingHours < totalWorkingHours) {
                currentWorkingHours += FULL_DAY_HOURS;
            } else {
                currentWorkingDays++;
                currentWorkingHours = 0;
            }

            totalWage += wagePerHour * currentWorkingHours;
        }

        System.out.println("Total wage for the month is " + monthlyWage);
    }
}
