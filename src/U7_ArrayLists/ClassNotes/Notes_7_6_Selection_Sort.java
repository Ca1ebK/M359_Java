package U7_ArrayLists.ClassNotes;

public class Notes_7_6_Selection_Sort {
    // reminder: copy and paste code to notability notes
    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 2, 1, 6, 0, 7};

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
            int placeholder = nums[i];
            nums[i] = nums[min];
            nums[min] = placeholder;
        }
    }
}
