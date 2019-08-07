import java.util.Scanner;

public class PassFailSubjectwise {
    public static void main(String[] args) {
        System.out.println("Enter Student Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter Roll No. :");
        int roll = scanner.nextInt();
        System.out.println("Enter First Subject Marks:");
        int fs = scanner.nextInt();
        System.out.println("Enter Second Subject Marks:");
        int ss = scanner.nextInt();
        System.out.println("Enter Third Subject Marks:");
        int ts = scanner.nextInt();

        System.out.println(fs>=35 || ss >=35 || ts>=35 ? "Pass" :"fail");

    }
}