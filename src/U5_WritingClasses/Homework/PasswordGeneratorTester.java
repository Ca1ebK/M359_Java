package U5_WritingClasses.Homework;

public class PasswordGeneratorTester {
    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}
