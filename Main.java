import Characters.Mage;
import Characters.Warrior;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("Thorin", 5, 140);
        Mage m = new Mage("Ariana", 6, 100);

        w.info();
        m.info();

        BattleArena arena = new BattleArena();
        arena.fight(w, m);
    }
}