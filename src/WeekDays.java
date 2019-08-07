import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        System.out.println("Enter value:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i == 1){System.out.println("Monday");}
        else if (i == 2) {System.out.println("Tuesday");}
        else if (i == 3) {System.out.println("Wednesday");}
        else if (i == 4) {System.out.println("Thursday");}
        else if (i == 5) {System.out.println("Friday");}
        else if (i == 6) {System.out.println("Saturday");}
        else if (i == 7) {System.out.println("Sunday");}
        else {System.out.println("Invalid Entry");
        }
    }
}