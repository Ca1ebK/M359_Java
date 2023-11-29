package U6_Arrays.ClassNotes;

import java.sql.SQLOutput;

public class ForEachLoopPractice {

    public static void main(String[] args) {
        int[] favNums = {31, 3, 23, 17, 7, 13};

        // for (dataType tempVarName: arrName)
        for (int a: favNums) {
            // System.out.print(a + " ");
            // common error
            // System.out.print(favNums[a] + " ");
        }

        // write a traditional for loop that will double all values in the array favNums
        // after the loop, favNums will be changed
        System.out.println("\n\nOriginal Array");
        printArr(favNums);
        for (int i = 0; i < favNums.length; i++) {
            favNums[i] *= 2;
        }
        System.out.println("\nDoubled Array");
        printArr(favNums);

        for (int a: favNums) {
            a *= 2;
        }
        System.out.println("\nDid this double the array?");
        printArr(favNums);

    }

    /**
     * This helper method will print each int in the array with a space in between values
     * @param arr the array of values to print
     */

    public static void printArr(int[] arr) {
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

}
