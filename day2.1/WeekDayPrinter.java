import java.util.Scanner;
public class WeekDayPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter week number (1-7): ");
        int weekNumber = scanner.nextInt();
        switch (weekNumber) {
            case 1:
                System.out.println("Weekday: Sunday");
                break;
            case 2:
                System.out.println("Weekday: Monday");
                break;
            case 3:
                System.out.println("Weekday: Tuesday");
                break;
            case 4:
                System.out.println("Weekday: Wednesday");
                break;
            case 5:
                System.out.println("Weekday: Thursday");
                break;
            case 6:
                System.out.println("Weekday: Friday");
                break;
            case 7:
                System.out.println("Weekday: Saturday");
                break;
            default:
                System.out.println("Invalid week number! Please enter a number between 1 and 7.");
                break;
        }
        scanner.close();
    }
}
