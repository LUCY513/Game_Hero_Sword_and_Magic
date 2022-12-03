public class MediumShield extends Shield {

    @Override
    public Integer protection() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Medium Shield-> %d", protection());
    }
}
