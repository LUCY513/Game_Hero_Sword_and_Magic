import java.util.*;

// <T> - сделали обобщение типа и сразу определили конкретный тип
// путем наслдования от Warriors, указав
// что там могут находиться только элементы типа Warriors
public class Team<T extends Warrior> implements Iterable<T> {

    private Hero hero;
    private List<T> team_1 = new ArrayList<>();

    public Team(Hero hero){
        this.hero = hero;
    }

    public void add(T pers){
        team_1.add(pers);
    }

    public Integer getAmoundHealth(){
        int summ = hero.getHealthPoint();

        for (T member: this) {
            summ += member.getHealthPoint();
        }
        return summ;
    }

    @Override
    public Iterator<T> iterator() {
        return team_1.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(hero.toString() + "\n");
        for (T item : this) {
            sb.append(item.toString() + "\n");
        }
        return sb.toString();
    }
}
