package Interfaces;

import Characters.GameCharacter;

public interface Combatable {
    public void attack(GameCharacter target);
    public void defend();
}
