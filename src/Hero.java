
public class Hero extends Warrior<Weapon, Protection> {

    public Hero(String name, Integer healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }

    public Hero(String name, Integer healthPoint, Weapon weapon, Protection shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("\n Hero: %s", super.toString());
    }
}
