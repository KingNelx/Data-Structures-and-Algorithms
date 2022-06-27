package ProblemSolving;

public class Act2 {
    public static void main (String[]args){
        // Write a Java program to sum values of an array.
        int[]myNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        for(int i = 0; i < myNumbers.length; i++){
            sum += myNumbers[i];
        }

        System.out.println(" Total sum of the array is: " + sum);
    }
}
