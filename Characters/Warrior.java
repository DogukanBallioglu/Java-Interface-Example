package Characters;

import Interfaces.Combatable;
import Interfaces.SkillUser;

public class Warrior extends GameCharacter implements Combatable, SkillUser {

    public Warrior(String name, int level, int health){
        super(name, level, health);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " kılıç saldırısı yapıyor.");
        target.takeDamage(15 + level * 2);
    }

    @Override
    public void defend() {
        System.out.println(name + " kalkanıyla kendini savunuyor.");
    }

    @Override
    public void useSkill(GameCharacter target) {
        System.out.println(name +  " BERSERK STRIKE kullanıyor.");
        target.takeDamage(30 + level * 3);
    }
}
