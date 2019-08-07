import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter Year :");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if( i % 4==0 ||  i % 100!=0 || i % 400==0) {System.out.println("Leap Year");}
        else  {System.out.println("Common Year");}
    }
}
