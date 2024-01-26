package U7_ArrayLists.ClassNotes;

public class Notes_7_6_Selection_Sort {
    // reminder: copy and paste code to notability notes
    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 2, 1, 6, 0, 7};

        printArr(nums);     // before the sort
        /*
            outer for loop i = 0 to i < length - 1
                set min index = i
                inner for loop j = i + 1 to i < length
                    compare value at index j with value at index min
                    if value is smaller, then min = j

                (after inner loop is done)
                swap value at index i with index min
         */
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            // swap - 3 lines of code
            int placeholder = nums[i];
            nums[i] = nums[min];
            nums[min] = placeholder;
        }

        printArr(nums);     // after the sort

        String[] names = {"Levyn", "Kyle", "Evangeline", "Kay", "Cole", "Mortimer"};
        // before sort
        printArr(names); // overloading
        selectionSort(names);
        printArr(names);
    }


    // Arrays are objects!  So when I pass in the array arr
    // when the method is done, the array that was passed in
    // is sorted and changed forever
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                // need compareTo for comparing strings
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            // swap - 3 lines of code
            String placeholder = arr[i];
            arr[i] = arr[min];
            arr[min] = placeholder;
        }
    }

    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s + ",   ");
        }
        System.out.println();
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
