package U5_WritingClasses.MarvelEx;

public class MarvelCharacter {
    private String name;
    private Power specialPower;
    private boolean isHero;

    public MarvelCharacter(String name, Power specialPower, boolean isHero) {
        this.name = name;
        this.specialPower = specialPower;
        this.isHero = isHero;
    }

    // you MUST use this method header for this method to be
    // called AUTOMATICALLY for you when you print a MarvelCharacter object
    public String toString() {
        // Spiderman, Slings webs: 7, Hero
        String isHero = "";
        if (this.isHero) {
            isHero = "Hero";
        }
        else {
            isHero = "Villain";
        }
        return this.name + ", " + this.specialPower.getName() + ": " + this.specialPower.getPower() + ", " + isHero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(Power specialPower) {
        this.specialPower = specialPower;
    }

    public boolean isHero() {
        return isHero;
    }

    public void setHero(boolean hero) {
        isHero = hero;
    }
}
