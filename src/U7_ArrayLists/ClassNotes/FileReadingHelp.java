package U7_ArrayLists.ClassNotes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingHelp {

    public static void main(String[] args) {
        // try to read the file
        try {
            Scanner fileIn = new Scanner(new File("teacherData.txt"));
            System.out.println("File opened");
            //01-17   21 Shannon Denna/Fremd High School
            String bday = fileIn.next();    // read String text up until a space or EOL
            int age = fileIn.nextInt();     // read int data up until a space or EOL
            String rest = fileIn.nextLine();    // read all remaining data AND EOL
            int loc = rest.indexOf("/");    // find out where the / is located
            String name = rest.substring(0, loc);
            String school = rest.substring(loc + 1);
            System.out.println(bday + ", " + age + ", " + name + ", " + school);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
