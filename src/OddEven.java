//Input any two number and find out its odd or even use turnery operator (? :)

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number = ");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number = ");
        int b = scanner.nextInt();

        System.out.println((a%2)==0 ? "First Number is Even" : "Second Number is Odd");
        System.out.println((b%2)==0 ? "First Number is Even":  "Second Number is Odd");

    }


}
