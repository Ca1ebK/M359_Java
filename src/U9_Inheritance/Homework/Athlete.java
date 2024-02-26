package U9_Inheritance.Homework;

public class Athlete {

    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get/set methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
