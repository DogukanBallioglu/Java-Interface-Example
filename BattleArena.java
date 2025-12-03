import Characters.GameCharacter;
import Interfaces.Combatable;
import Interfaces.SkillUser;

import java.util.Random;

public class BattleArena {

    private Random random = new Random();

    public void fight(GameCharacter c1, GameCharacter c2){
        System.out.println("=== SAVAŞ BAŞLADI! ===");

        while(c1.isAlive() && c2.isAlive()){

            takeTurn(c1, c2);

            if(!c2.isAlive()) break;

            takeTurn(c2, c1);
        }

        GameCharacter winner = c1.isAlive() ? c1 : c2;
        System.out.println("Kazanan: " + winner.name);
        winner.gainEXP(120);
    }



    private void takeTurn(GameCharacter attacker, GameCharacter defender){

        int action = random.nextInt(2);

        if(attacker instanceof SkillUser && action == 1){
            ((SkillUser) attacker).useSkill(defender);
        } else if(attacker instanceof Combatable){
            ((Combatable) attacker).attack(defender);
        }

        System.out.println();
    }
}
