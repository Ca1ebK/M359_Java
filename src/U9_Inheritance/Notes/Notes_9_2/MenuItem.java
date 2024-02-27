package U9_Inheritance.Notes.Notes_9_2;

public class MenuItem {
    private String name;

    /*
    This is a no-argument constructor
    Also called a default constructor
    This is what any subclass will call implicitly
    if we do not tell it to call super explicitly
     */
    public MenuItem() {
        name = "none given";
        System.out.println("Created a MenuItem without a name?!?!?");
    }
    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }
}
