package U4_Iteration.Homework;

public class ChallengeProblem {
    public static void main(String[] args) {

        String initialStr = "        ";
        String starStr = "   *   *   *   *";

        // Challenge
        for (int i = 4; i >=0; i--) {
            System.out.println(initialStr.substring(0, i*2) + "*" + starStr.substring(0, 4*(4-i)));
        }

        // Enhancements
        for (int i = 0; i <= 6; i += 2) {
            System.out.println(initialStr.substring(0, i+2) + "*" + starStr.substring(0, 12-(2*i)));
        }

    }
}
