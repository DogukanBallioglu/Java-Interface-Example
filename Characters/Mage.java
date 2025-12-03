package Characters;

import Interfaces.Combatable;
import Interfaces.SkillUser;

import javax.swing.*;

public class Mage extends GameCharacter implements Combatable, SkillUser {

    public Mage(String name, int level, int health){
        super(name, level, health);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " büyü saldırı yapıyor.");
        target.takeDamage(10 + level * 3);
    }

    @Override
    public void defend() {
        System.out.println(name + " büyü kalkanıyla kendini savunuyor.");
    }

    @Override
    public void useSkill(GameCharacter target) {
        System.out.println(name + " FIREBALL kullanıyor!");
        target.takeDamage(35 + level * 2);
    }
}
