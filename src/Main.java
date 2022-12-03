import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero hero_1 = new Hero("Heracles", 150, new Sword(), new MediumShield());
        Hero hero_2 = new Hero("Losos", 200, new Sword(), new HeavyShield());
        Hero hero_3 = new Hero("Selena", 100, new LongBow());
        // Team 1
        Team<Warrior> red = new Team<>(hero_1);
        red.add(new Tank("Garen", 130,new Sword(), new HeavyShield()));
        red.add(new Archer("Lucy", 100, new Bow(), 100));
        red.add(new Mage("Gandalf", 80, new Staff(), new Shield(), 80, 150));
        // Team 2
        Team<Warrior> blue = new Team<>(hero_2);
        blue.add(new Tank("Darius", 110, new Sword(), new MediumShield()));
        blue.add(new Archer("Ash", 100, new Bow(), 100));
        blue.add(new Mage("Zoi", 80, new Staff(), new Shield(), 80, 120));
        // Team 3
        Team<Warrior> dark = new Team<>(hero_3);
        dark.add(new Tank("Scarner", 120, new Sword()));
        dark.add(new Archer("Calista", 90, new LongBow(), new Shield(), 110));
        dark.add(new Mage("Taliya", 90, new Staff(), 90, 130));


        System.out.format(": Team red : %s", red);
        System.out.format("Amount health red team: %s \n", red.getAmoundHealth());
        System.out.println();
        System.out.format(": Team blue : %s", blue);
        System.out.format("Amount health blue team: %s\n", blue.getAmoundHealth());
        System.out.println();
        System.out.format(": Team dark : %s", dark);
        System.out.format("Amount health dark team: %s\n", dark.getAmoundHealth());


//        System.out.println(hero_1);
//        System.out.println();
//        for (Warrior item : red) {
//            System.out.println(item);
//            System.out.println();
//
//        }
//
//        System.out.println(hero_2);
//        System.out.println();
//        for (Warrior item : blue) {
//            System.out.println(item);
//            System.out.println();
//        }

    }
}