public class Array1 {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[5] = 6; // index out of bounds since the size of the array is static (5)
        for (int i : myArray) {
            System.out.println(i);
        }
    }
}