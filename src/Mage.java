// Тут в обобщении мы указываем конктерный тип щита
// и другой мы уже не смодем подставитьб как и с оружием
public class Mage extends Warrior<Staff, Shield>{

    private Integer range;
    private Integer mana;

    public Mage(String name, Integer healthPoint, Staff weapon, Integer range, Integer mana) {
        super(name, healthPoint, weapon);
        this.range = range;
        this.mana = mana;
    }

    public Mage(String name, Integer healthPoint, Staff weapon, Shield shield, Integer range, Integer mana) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("Mage: %s  Range -> %d |  Mana -> %d |", super.toString(), range, mana);
    }
}
