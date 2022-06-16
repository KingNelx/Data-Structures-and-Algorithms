package ArraysProblem;


public class Act1 {
    public static void main (String[]args){
        // Write a Java program to sort a numeric array and a string array.

      int[]myNumbers = {350, 232, 456, 121, 879, 654, 478, 987, 428};
      String[]myNames = {"Invoker", "Tinker", "Sniper", "Templar", "Earth shaker",
            "Witch Doctor", "Shadow Fiend"};

        System.out.println(" Before Sorting.. ");
        for(int i = 0; i < myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }

      for(int i = 0; i < myNumbers.length; i++){
        for(int j = 0; j < myNumbers.length; j++){
            int temp;
            if(myNumbers[i] > myNumbers[j]){
                temp = myNumbers[i];
                myNumbers[i] = myNumbers[j];
                myNumbers[j] = temp;
            }
        }
      }
        System.out.println(" After Sorting.. ");
      for(int i = 0; i < myNumbers.length; i++){
          System.out.println(myNumbers[i]);
      }
    }
}
