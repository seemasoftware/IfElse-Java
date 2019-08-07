import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = scanner.nextInt();

        System.out.println("Enter Second Number:");
        int b = scanner.nextInt();

        System.out.println("Choose Symbol from +,_,*,/:");
String symbol = scanner.next();
if(symbol.equals("+")) {System.out.println(a + b);}
 else if (symbol.equals("-")) { System.out.println(a - b);}
       else if(symbol.equals("*")) { System.out.println(a * b);}
           else if(symbol.equals("/")) {System.out.println(a / b);}
            }
        }

