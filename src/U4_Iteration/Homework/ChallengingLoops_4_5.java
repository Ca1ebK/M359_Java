package U4_Iteration.Homework;

public class ChallengingLoops_4_5 {
    public static void main(String[] args) {
//        int n = 5;
//        while (n > 0) {
//            for (int i = 1; i <= n; i++) {
//                System.out.print(i);
//            }
//            System.out.println();
//            n--;
//        }

//        int a = 5;
//        while (a > 0) {
//            for (int i = 0; i < a; i++) {
//                System.out.print(a);
//            }
//            System.out.println();
//            a--;
//        }

        everyOtherPyramid("FremdVikings");

    }

    // FremdVikings
    // Fediig
    // Fdi
    // Fi
    // F

    public static void everyOtherPyramid(String str) {
        int n = str.length();
        String newStr = "";
        for (int a = 0; a < n / 2; a++) {
            for (int i = 0; i < n; i += 2) {
                newStr += str.charAt(i);
            }
            System.out.println(newStr);
        }
    }
}
