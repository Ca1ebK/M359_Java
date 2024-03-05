package U9_Inheritance.Notes.Notes_9_5;

/**
* Lesson 9-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold?

       // My answer: Animal
       // Denna's answer: Animals

       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?

       // My answer: No. I think this is allowed because all of the other objects are subclasses of the Animal superclass.
       // Denna's answer: I can store an Animal object ref OR an object ref of subclass of Animal
       // pig "is-an" Animal
       // subclass of pig can be put in the array

       for (Animal a: barn)
            a.speak();
            // 3. What method is getting called here?  The speak method of the Animal class?
            // it depends. if the object is an animal, then it will call the speak method of the Animal class.
            // however, if the object is a subclass, then it will call the subclass's method

            // Denna's answer: the speak method that is called is dependent upon the type of object in the array
            // cow will call the cow speak() method, a pig will call pig method, etc.

       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
       // We created an array of Animal objects and subclass objects.
       // We used a loop to call the speak() method on each object in the array.
       // the speak() method invokes the subclass method or the super class method depending on if the object
       // is a cow/pig or Animal, respectively, using method overriding
   }
   
}
