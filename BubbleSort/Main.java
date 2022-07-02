package BubbleSort;

public class Main {
    public static void main (String[]args){
        int [] testArray = {10, 2, 5, 7, 1, 3, 4, 8, 9, 6};

        System.out.println(" Original Array ");
        for(int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }

        System.out.println(" Array Sorted ");
        for(int i = 0; i < testArray.length; i++){
            for(int j = i; j < testArray.length; j++){
                if(testArray[i] < testArray[j]){
                    int temp = testArray[i];
                    testArray[i] = testArray[j];
                    testArray[j] = temp;
                }
            }
        }
        for(int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
    }
}
