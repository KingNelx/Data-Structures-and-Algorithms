import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Input the size of the array: ");
        int sizeN = input.nextInt();
        int[] myArray = new int[sizeN];

        // storing elements
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(" Input elements in the array: ");
            myArray[i] = input.nextInt();
        }

        // printing elements
        System.out.println(" ELEMENTS: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        input.close();
    }
}