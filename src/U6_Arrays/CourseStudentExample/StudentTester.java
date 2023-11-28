package U6_Arrays.CourseStudentExample;

public class StudentTester {
    public static void main(String[] args) {
        Course science = new Course("Adams", "Physics", "A+", 1);
        Course math1 = new Course("Zaluckyj", "AP Statistics", "A-", 2);
        Course socialStudies1 = new Course("Dvorak", "AP Psychology", "A+", 3);
        Course lunch = new Course("Lunch", 4);
        Course math2 = new Course("Mantra", "AP Calculus BC", "A", 5);
        Course gym = new Course("Brandenburg", "Strength and Conditioning", "A+", 6);
        Course socialStudies2 = new Course("Widlowski", "Economics", "A+", 7);
        Course math3 = new Course("Denna", "AP Computer Science", "A+", 8);

        // Initializer lists are GREAT when we know all the data that
        // will be starting in the array.
        // You can only use an initializer list on the same line
        // where you declare the array.

        Course[] calebsClasses = {science, math1, socialStudies1, lunch, math2, gym, socialStudies2, math3};
        Student caleb = new Student("Caleb Kang", calebsClasses);
        // System.out.println(caleb);
    }
}
