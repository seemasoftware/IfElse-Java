import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter Alpha Character:");
        Scanner scanner = new Scanner(System.in);
        char i = scanner.next().charAt(0);

        int a;
        a=(int)i;

        if(a == 65 || a == 69||a == 73 || a ==79|| a == 85 || a == 97 ||  a == 101 || a == 105 || a == 111 || a == 112)
            {
                System.out.println("Vowel");
            }
        else
                System.out.println("Consonant");

        }
    }
