package U8_2DArrays.Homework;

public class U8OptionalFRQ {

    public static void main(String[] args) {
        isNonZeroRow(new int[][] {{2, 1, 0},
                      {1, 3, 2},
                      {0, 0, 0},
                      {4, 5, 6}}, 3);
    }

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int i : array2D[r]) {
            if (i == 0) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

}
