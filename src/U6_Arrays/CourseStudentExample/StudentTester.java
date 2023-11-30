package U6_Arrays.CourseStudentExample;

import java.util.Scanner;
import java.io.*;


public class StudentTester {
    public static void main(String[] args)  throws IOException, FileNotFoundException {
//        Course p1 = new Course("Adams", "Physics", "A+", 1);
//        Course p2 = new Course("Zaluckyj", "AP Statistics", "A-", 2);
//        Course p3 = new Course("Dvorak", "AP Psychology", "A+", 3);
//        Course p4 = new Course("Lunch", 4);
//        Course p5 = new Course("Mantra", "AP Calculus BC", "A", 5);
//        Course p6 = new Course("Brandenburg", "Strength and Conditioning", "A+", 6);
//        Course p7 = new Course("Widlowski", "Economics", "A+", 7);
//        Course p8 = new Course("Denna", "AP Computer Science", "A+", 8);

        // Initializer lists are GREAT when we know all the data that
        // will be starting in the array.
        // You can only use an initializer list on the same line
        // where you declare the array.

        // Course[] calebsClasses = {p1, p2, p3, p4, p5, p6, p7, p8};
        // Student caleb = new Student("Caleb Kang", calebsClasses);
        // System.out.println(caleb);


        Scanner inF = new Scanner(new File("oneCourse.txt"));
        String teacher = inF.nextLine();
        String className = inF.nextLine();
        String grade = inF.nextLine();
        int period = inF.nextInt();

        Course C = new Course(teacher, className, grade, period);
        System.out.println(C);

        // Make an array of type Course to save all the
        // course data
        Course[] schedule = new Course[8];

        // Open the schedule data file
        Scanner inSchedule = new Scanner(new File("oneSchedule.txt"));
        String studentName = inSchedule.nextLine();

        // Use a loop to read in all 8 sets of Course data
        for (int i = 0; i < schedule.length; i++) {
            String myTeacher = inSchedule.nextLine();
            String myClass = inSchedule.nextLine();
            String myGrade = inSchedule.nextLine();
            int myPeriod = inSchedule.nextInt();
            Course myCourse = new Course(myTeacher, myClass, myGrade, myPeriod);
            schedule[i] = myCourse;
        }

        // Fix the run time error
        // close the Scanner objects

    }
}
