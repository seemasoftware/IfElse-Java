import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        System.out.println("Enter Any Number =");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i>=1)
        {System.out.println("Positive");}
         else if(i<=-1)
          {System.out.println("Negative");}
         else {System.out.println("Zero");}

    }
}
