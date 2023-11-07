package U5_WritingClasses.MarvelEx;

public class MarvelMovieTester {
    public static void main(String[] args) {
        // className var = new className( ... params ...);
        Power webslinger = new Power("Slings webs", 80);
        MarvelCharacter spiderman = new MarvelCharacter("Spiderman",
                webslinger, true);
        MarvelCharacter milesMorales = new MarvelCharacter("Miles Morales", webslinger, true);


        Power grenades = new Power("Pew pew - kaboom", 40);
        MarvelCharacter greenGoblin = new MarvelCharacter("Green goblin",
                grenades, false);

        System.out.println(spiderman);
        // System.out.println(greenGoblin);
        System.out.println(milesMorales);

        int amtToAdd = 15;
        changePower(webslinger, amtToAdd);
        System.out.println("Adding " + amtToAdd);
        // battle(spiderman, greenGoblin);

        System.out.println(spiderman);
        // System.out.println(greenGoblin);
        System.out.println(milesMorales);

        System.out.println("New value is: " + amtToAdd);
    }

    public static void battle(MarvelCharacter char1, MarvelCharacter char2) {
        int char1Damage = (int)(Math.random() * char1.getSpecialPower().getPower() + 1);
        int char2Damage = (int)(Math.random() * char2.getSpecialPower().getPower() + 1);

        char1.setHealth(char1.getHealth()-char2Damage);
        char2.setHealth(char2.getHealth()-char1Damage);

        System.out.println(char1.getName() + " Health: " + char1.getHealth());
        System.out.println(char2.getName() + " Health: " + char2.getHealth());
    }

    public static void changePower(Power p, int val) {
        int oldPower = p.getPower();
        val++;
        p.setPower(oldPower + val);
    }

}
