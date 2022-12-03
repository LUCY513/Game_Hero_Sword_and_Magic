public class Shield implements Protection {

    @Override
    public Integer protection() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Light Shield -> %d", protection());
    }
}
