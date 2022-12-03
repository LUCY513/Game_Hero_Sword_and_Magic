import java.util.*;

// Указали два обобщения типа Weapon и Protection для возможности исп. одновременно как и оружия так и щита
public abstract class Warrior<T extends Weapon, S extends Protection> {
    private String name;
    private Integer healthPoint;
    private T weapon;
    private S shield;

    // Основной контрутор
    public Warrior(String name, Integer healthPoint, T weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    // Создал дополнительный конструкор с новым параметром shield для щита
    public Warrior(String name, Integer healthPoint, T weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    // Преопределили вывод и сделали условие если shield не задон (null)
    // то будем исп. конструктор с тремя параметрами
    @Override
    public String toString() {
        if (this.shield == null) {
            return String.format("Name -> %s | Health -> %d  | %s |", name, healthPoint, weapon);
        }
        return String.format("Name -> %s | Health -> %d  | %s | %s |", name, healthPoint, weapon, shield);
    }
}
