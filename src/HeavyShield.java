public class HeavyShield implements Protection {

    @Override
    public Integer protection() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Heavy Shield -> %d", protection());
    }
}
