public class Bow implements Weapon {

    @Override
    public Integer damage() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Bow damage -> %d", damage());
    }
}
