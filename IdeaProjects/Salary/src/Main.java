import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordinarySalary = 150;
        int overtimeSalary = 250;
        int monthlyHours = 160;
        int withoutOvertime = 150 * 160;
        int answer;

        System.out.println("Type in your total time for this month");
        answer = scanner.nextInt();


        if (answer == 350 || answer == 0) {
            System.out.println("Your answer is invalid, try again");
        } else if (answer <= 160) {
            System.out.println("You have earned a total of " + (answer * ordinarySalary) + "sek this month");
        } else if (answer > 160) {
            int overtimeHours = answer - monthlyHours;
            int overtimePay = overtimeHours * overtimeSalary;
            System.out.println("You have earned a total of " +
                    (overtimePay + withoutOvertime) + "sek this month including overtime");
        }


    }
}
