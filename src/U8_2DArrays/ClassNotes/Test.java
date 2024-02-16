package U8_2DArrays.ClassNotes;

public class Test {

    public static void main(String[] args) {
        int[][] mat = {{1, 3, 5, 7}, {2, 4, 6, 8}, {3, 5, 7, 9}};

        alter(0, mat);
    }

    public static void alter(int c, int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = c + 1; j < mat[0].length; j++) {
                mat[i][j-1] = mat[i][j];
            }
        }

        for (int[] row : mat) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
