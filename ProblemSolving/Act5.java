package ProblemSolving;
import java.util.Scanner;

public class Act5 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print(" Enter the size of the array: ");
        size = input.nextInt();
        int[] myArray = new int[size];

        System.out.println(" Enter elements in the array ");

        for (int i = 0; i < size; i++) {
            myArray[i] = input.nextInt();
        }

        System.out.println(" Square of the elements of inputted array is ");
        for(int i = 0; i < myArray.length; i++){
            int res = myArray[i] * myArray[i];
            System.out.println(res);
        }


    }
}
