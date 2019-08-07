//(WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B

 import java.util.Scanner;

public class MarkSheet {
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

        int Total = (fs + ss + ts);

        System.out.println("Total Marks of Three Subject" + " = " + Total);
        System.out.println("Total Percentage = " + (Total / 3) + " % ");
        if ((Total / 3) >= 35) {
            System.out.println("Result is Pass");
        } else
            System.out.println("Result is Fail");
        if ((Total / 3) >= 35) {
            {
                System.out.print("Grade = ");
                {
                    if ((Total / 3) >= 80) {
                        System.out.print("A+");
                    } else if ((Total / 3) >= 60 && ((Total / 3) <= 80)) {
                        System.out.print("A");
                    } else if ((Total / 3) <= 60 && ((Total / 3) >= 50)) {
                        System.out.print("B");
                    } else if ((Total <= 50) && (Total / 3) <= 35) {
                        System.out.print("C");
                    } else {
                        System.out.println("");
                    }
                }
            }
        }
    }
}

