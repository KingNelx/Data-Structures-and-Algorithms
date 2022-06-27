package Arrays;

public class Array1{
    public static void main (String[]args){

        int [] sampleArray = {2, 4, 6, 8, 10};

        modifyArray(sampleArray);
    }

    public static void modifyArray(int [] testArray){
        for(int i = 0; i < testArray.length; i++){
            System.out.println(" Elements in the array are: " + testArray[i]);
        }
    }
}