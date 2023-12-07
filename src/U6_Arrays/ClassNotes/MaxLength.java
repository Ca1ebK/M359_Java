package U6_Arrays.ClassNotes;

public class MaxLength {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(getLongestRun(arr));
    }
    public static int getLongestRun(int[] values) {
        int len = 0;
        int maxLen = 0;
        int maxIndex = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                len++;
            }
            else {
                len = 0;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i - len;
            }
        }

        if (maxLen == 0) {
            return -1;
        }
        else {
            return maxIndex;
        }

    }
}
