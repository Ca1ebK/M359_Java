package U5_WritingClasses.MarvelEx;

public class MarvelMovieTester {
    public static void main(String[] args) {
        // className var = new className( ... params ...);
        Power webslinger = new Power("Slings webs", 7);
        MarvelCharacter spiderman = new MarvelCharacter("Spiderman",
                webslinger, true);

        Power grenades = new Power("Pew pew - kaboom", 3);
        MarvelCharacter greenGoblin = new MarvelCharacter("Green goblin",
                grenades, false);

        System.out.println(spiderman);
        System.out.println(greenGoblin);
    }
}
