package U6_Arrays.CourseStudentExample;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Student {

    String name;
    Course[] myClasses;

    public Student(String name) {
        this.name = name;
        myClasses = new Course[8];
    }

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    @Override
    public String toString() {
        String str = "Student Name: " + name + "\n";
        for (int i = 0; i < myClasses.length; i++) {
            str += myClasses[i].toString() + "\n";
        }
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}
