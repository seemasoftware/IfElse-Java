import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first digit :");
        int a = scanner.nextInt();
        System.out.println ("Enter Second digit :");
        int b = scanner.nextInt();
        System.out.println ("Enter Third digit");
        int c = scanner.nextInt();
        System.out.println("Enter Four digit :");
        int d = scanner.nextInt();
        System.out.println("Enter Fifth digit :");
        int e = scanner.nextInt();
        int Total =(a+b+c+d+e);
        int Avr = Total/5;

        System.out.println("Average = "+ Avr );




    }
}
