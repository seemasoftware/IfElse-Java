import java.util.Scanner;

public class Commission {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID :");
        int id = scanner.nextInt();
        System.out.println("Enter Seller Name :");
        String name = scanner.next();
        System.out.println("Enter Basic Salary :");
        double salary = scanner.nextDouble();
        System.out.println("Enter Sales Amount");
        double amount = scanner.nextDouble();
        if(amount>=50000)
        {System.out.println("Commission ="+(amount*0.35));
        }
        else if(amount>=30000){
            System.out.println("Commission ="+(amount*0.20));
             }
        else if (amount>=20000){System.out.println("Commission ="+(amount*0.10));}
        else if(amount>=10000){System.out.println("Commission ="+(amount*0.05));}
        else{System.out.println("Commission ="+(amount*0.02));}
            }
}
