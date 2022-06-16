package ArraysProblem;

public class Act4 {
    public static void main (String[]args){
        // Write a Java program to calculate the average value of array elements

        int[]grades = {89, 87, 91, 84, 88, 93};
        int sum = 0;
        double average = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        System.out.println(" Sum of grades: " + sum);

        average = sum / grades.length;
        System.out.println(" Average of grades: " + average);
    }
}
