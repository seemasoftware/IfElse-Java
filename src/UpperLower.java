import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet in UpperCase :");
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);

        int i;
        i = (int)a;
        i = i+32;

        a=(char)i;
        System.out.println(a);
    }
    }