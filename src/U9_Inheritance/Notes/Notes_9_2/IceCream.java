package U9_Inheritance.Notes.Notes_9_2;

public class IceCream extends MenuItem {
    private String toppings;
    private String flavor;

    public IceCream(String name, String toppings, String flavor) {
        super(name);
        //this.name = name; NOT allowed, private access to parent only
        this.toppings = toppings;
        this.flavor = flavor;
        //super("waffle cone"); // can't do this here!  Must be first line
        System.out.println("Yummy " + flavor + " icecream with " + toppings);
    }
}
