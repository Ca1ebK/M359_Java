package U5_WritingClasses.ClassNotes;

public class CodeTester {
    public static void main(String[] args) {
        Code code = new Code("ABCdef123ghi456jklMNO");
        code.hide(2, 7);
        System.out.println(code.getCode());
        code.recover(5, 9);
        System.out.println(code.getCode());
        code.hide(3, 14);
        System.out.println(code.getCode());
        code.hide(6, 10);
        System.out.println(code.getCode());
        code.recover(5, 6);
        System.out.println(code.getCode());
        code.recover(0, 14);
        System.out.println(code.getCode());
    }
}
