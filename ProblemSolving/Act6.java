package ProblemSolving;
import java.util.Scanner;

class Options{
    public void options(){
        System.out.println(" 1. Add ");
        System.out.println(" 2. Subtract ");
        System.out.println(" 3. Multiply ");
        System.out.println(" 4. Square Root ");
        System.out.println(" 5. Modulus ");
        System.out.println(" 6. Exit ");
    }
}
public class Act6 {
    public static void main (String[]args){
        Options s1 = new Options();
        int choice;
        Scanner input = new Scanner(System.in);
        do{

        s1.options();
        System.out.print(" Select your choice: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                int n1, n2;
                System.out.print(" Enter 1st number: ");
                n1 = input.nextInt();

                System.out.print(" Enter 2nd number:" );
                n2 = input.nextInt();

                int res = n1 + n2;
                System.out.println(" Adding two numbers / result : " + res);
                break;

            case 2:
                int a1, a2;
                System.out.print(" Enter 1st number: ");
                a1 = input.nextInt();

                System.out.print(" Enter 2nd number: ");
                a2 = input.nextInt();

                int res1 = a1 - a2;
                System.out.println(" Subtracting two numbers / result  " + res1);
                break;

            case 3:
                int m1, m2;
                System.out.print(" Enter 1st number: ");
                m1 = input.nextInt();

                System.out.print(" Enter 2nd number: ");
                m2 = input.nextInt();

                int res3 = m1 * m2;
                System.out.println(" Multiplying 2 numbers / result: " + res3);
                break;

            case 4:
                int p1 ,p2;
                System.out.print(" Enter 1st number: ");
                p1 = input.nextInt();

                System.out.print(" Enter 2nd number: ");
                p2 = input.nextInt();

                int res4 = p1 / p2;
                System.out.println(" Diving 2 numbers / result: " + res4);
                break;

            case 5:
                int l1;
        }

    } while(choice != 6);
}
    }
