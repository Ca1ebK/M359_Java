package U8_2DArrays.Homework;

public class TestReview {
    public static void main(String[] args) {

        // Question 1

        int[][] nums = new int[4][6];
        int increment = 2;
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[0].length; c++) {
                nums[r][c] = c * increment;
            }
            increment++;
        }

        printArr(nums);
        System.out.println();

        // Question 2

        int[][] vals = new int[5][3];
        int start = 1;
        for (int r = 0; r < vals.length; r++) {
            for (int c = 0; c < vals[0].length; c++) {
                vals[r][c] = start + c;
            }
            start++;
        }

        printArr(vals);

    }

    public static void printArr(int[][] arr2D) {
        for (int[] row : arr2D) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
