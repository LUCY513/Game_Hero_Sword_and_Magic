public class Staff implements Weapon{

    @Override
    public Integer damage() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Staff damage -> %d", damage());
    }
}
