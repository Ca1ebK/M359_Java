package U10_Recursion.Notes;

public class RecursionBasics {

    public static void main(String[] args) {
        System.out.println("moreFun(6, 5) is: " + moreFun(6, 5));
        System.out.println();
        wordFunPrintFirst("FremdVikings", 8);
        System.out.println();
        wordFunPrintSecond("FremdVikings", 8);


    }


    public static int moreFun(int x, int y) {
        if (y <= 2) {
            return y;
        }
        else {
            return moreFun(x, y-2) + y;
        }
    }


    public static void wordFunPrintFirst(String str, int x) {
        if (x >= 1) { // know when your base case is (x = 0)
            System.out.print(str.substring(x, x+2));
            wordFunPrintFirst(str, x - 1);
        }
    }


    public static void wordFunPrintSecond(String str, int x) {
        if (x >= 1) {
            wordFunPrintSecond(str, x - 1);
            System.out.print(str.substring(x, x+2));
        }
    }
}
