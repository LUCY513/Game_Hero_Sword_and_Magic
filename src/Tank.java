// Для класса можно указать конкретный вид класса Щита
// или для того, чтобы выбрать любой вид щита можно указать сам Интерфей Protection
// от которого наследуються все щиты
// как тут в Обобщении указали Properties
public class Tank extends Warrior<Sword, Protection> {

    public Tank(String name, Integer healthPoint, Sword weapon) {
        super(name, healthPoint, weapon);
    }

    public Tank(String name, Integer healthPoint, Sword weapon, Protection shield) {
        super(name, healthPoint, weapon, shield);
    }


    @Override
    public String toString() {
        return String.format("Tank: %s", super.toString());
    }
}
