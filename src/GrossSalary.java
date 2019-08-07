import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee ID :");
        int i = scanner.nextInt();
        System.out.println("Enter Employee Name :");
        String name = scanner.next();
        System.out.println("Enter Basic Salary:");
        double salary = scanner.nextDouble();
         double hra = salary*(0.10); System.out.println("HRA ="+hra);
         double da = salary*(0.08); System.out.println("DA ="+da);
         double ta = salary*(0.09); System.out.println("TA ="+ta);
         double  pf = salary*(0.20); System.out.println("PF ="+pf);

         double gs = (salary+hra+da+ta-pf);
         System.out.println("Gross Salary = "+gs);
    }
}
