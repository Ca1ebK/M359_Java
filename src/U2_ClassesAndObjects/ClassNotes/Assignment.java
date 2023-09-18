package U2_ClassesAndObjects.ClassNotes;

public class Assignment {
    private String assignment_type;
    private String due_date;
    private double grade;
    private boolean completed;

    public Assignment(String type, String date, double percent){
        assignment_type = type;
        due_date = date;
        grade = percent;
        completed = true;
    }

    public Assignment(String type, String date, double percent, boolean isCompleted){
        assignment_type = type;
        due_date = date;
        grade = percent;
        completed = isCompleted;
    }

    public void printEverything(){
        System.out.println("Assignment type: " + assignment_type);
        System.out.println("Due date: " + due_date);
        System.out.println("Grade: " + grade);
        System.out.println("Turned in: " + completed);
    }

}
