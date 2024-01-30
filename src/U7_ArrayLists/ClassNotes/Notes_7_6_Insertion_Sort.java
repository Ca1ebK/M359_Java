package U7_ArrayLists.ClassNotes;

public class Notes_7_6_Insertion_Sort {

    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 2, 1, 6, 0, 7};
        printArr(nums);

    // for loop starting at index 1
        for (int i = 1; i < nums.length; i++) {
            // make a temp var to save the value that will be inserted
            int temp = nums[i];
            // while loop checks two things!
            // first, verify there is still a value to compare with
            // check if need to slide the value over

            // var represents the index we are checking
            int j = i - 1;
            // while loop!
        }
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
