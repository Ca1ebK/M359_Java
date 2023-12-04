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


//        Scanner inF = new Scanner(new File("oneCourse.txt"));
//        String teacher = inF.nextLine();
//        String className = inF.nextLine();
//        String grade = inF.nextLine();
//        int period = inF.nextInt();
//
//        Course C = new Course(teacher, className, grade, period);
//        System.out.println(C);

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
            // The EOL char after the number for the period
            // isn't 'consumed'. We need to get rid of it!

            // check if there is another line before we do the dummy read
            if (inSchedule.hasNextLine()) {
                // Do a dummy read!!!!
                inSchedule.nextLine();
            }


            Course myCourse = new Course(myTeacher, myClass, myGrade, myPeriod);
            schedule[i] = myCourse;
        }

        // Fix the run time error
        // close the Scanner objects

        inSchedule.close();
        Student s = new Student(studentName, schedule);
        System.out.println(s);

        /////////////////////////////////////////////////////////////////

        Scanner allSchedules = new Scanner(new File("studentScheduleData.txt"));
        int studentMaxSize = allSchedules.nextInt();
        // need a dummy read if we are reading a nextLine after a nextInt
        allSchedules.nextLine();

        Student[] allStudents = new Student[studentMaxSize];
        int index = 0; // this is where the new student is added in addStudents

        // continue as long as there is more data
        while (allSchedules.hasNextLine()) {
            // each time will read one student
            // complete the process to read in ONE student
            String name = allSchedules.nextLine();

            Course[] oneSchedule = new Course[8];
            // Use a loop to read in all 8 sets of Course data
            for (int i = 0; i < oneSchedule.length; i++) {
                String myTeacher = allSchedules.nextLine();
                String myClass = allSchedules.nextLine();
                String myGrade = allSchedules.nextLine();
                int myPeriod = allSchedules.nextInt();
                // The EOL char after the number for the period
                // isn't 'consumed'. We need to get rid of it!

                // check if there is another line before we do the dummy read
                if (allSchedules.hasNextLine()) {
                    // Do a dummy read!!!!
                    allSchedules.nextLine();
                }
                Course myCourse = new Course(myTeacher, myClass, myGrade, myPeriod);
                oneSchedule[i] = myCourse;
            }
            // Creating a Student object with the name and Course []
            Student myStudent = new Student(name, oneSchedule);
            allStudents[index] = myStudent;
            index++;

        }

        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(allStudents[i]);
        }

    }
}
