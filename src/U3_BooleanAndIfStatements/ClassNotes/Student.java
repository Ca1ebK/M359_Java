package U3_BooleanAndIfStatements.ClassNotes;

/*
This creates the blueprint for ONE
Student object
 */

public class Student {

    private String fName, lName;
    private int idNum;

    public Student(String fName, String lName, int idNum) {
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    /*
    Two students are equal if they have the same
    fName and lName
     */
    public boolean equals(Student other) {
        if (this.lName.equals(other.lName) && // don't have to say this.
            this.fName.equals(other.fName)) {
            return true;
        }
        return false;

        // OR
        // return this.lName.equals(other.lName) && this.fName.equals(other.fName)
    }

    /*
    Compare two students based on lName and if lNames are equal,
    then compare based on fName
     */

    // NONE OF THE CODE CHECKS FOR CAPITALIZATION
    public int compareTo(Student other) {
        // see if last names are equal
        if (this.lName.equals(other.lName)) {
            return this.fName.compareTo(other.fName);
        }
        // if lNames aren't equal...
        return this.lName.compareTo(other.lName);
    }



    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}
