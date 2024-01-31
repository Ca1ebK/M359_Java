package U7_ArrayLists.ClassNotes;

public class Notes_7_6_Insertion_Sort {

    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 2, 1, 6, 0, 7};
        printArr(nums);

    // for loop starting at index 1
        for (int i = 1; i < nums.length; i++) {
            // make a temp var to save the value that will be inserted
            int temp = nums[i];
            int j = i - 1;      // start comparing one value to the left
            // while loop checks two things!
            // first, verify there is still a value to compare with
            // check if need to slide the value over
            while (j >= 0 && temp < nums[j]) {
                // slide the value at j over right
                nums[j + 1] = nums[j];
                // move j one to the left to keep checking
                j--;
            }
            // insert the value back in
            nums[j + 1] = temp;
        }

        printArr(nums);

        String[] names = {"Yusr", "Jeff", "Ashwin", "Aditya", "Gavin"};
        printArr(names);
        insertionSortStrings(names);
        printArr(names);

    }
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArr(String[] arr) {
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void insertionSortStrings(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // make a temp var to save the value that will be inserted
            String temp = arr[i];
            int j = i - 1;      // start comparing one value to the left
            // while loop checks two things!
            // first, verify there is still a value to compare with
            // check if need to slide the value over
            while (j >= 0 && temp.compareTo(arr[j]) < 0) {
                // slide the value at j over right
                arr[j + 1] = arr[j];
                // move j one to the left to keep checking
                j--;
            }
            // insert the value back in
            arr[j + 1] = temp;
        }
    }
}
