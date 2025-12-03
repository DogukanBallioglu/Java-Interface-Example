package Characters;

public abstract class GameCharacter {

    public String name;
    protected int level;
    protected int health;
    protected int exp;

    public GameCharacter(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;
        this.exp = 0;
    }


    public boolean isAlive(){
        return health > 0;
    }

    public void takeDamage(int dmg){
        health -= dmg;
        if(health < 0) health = 0;
        System.out.println(name + " " + dmg + " hasar aldı! (Kalan HP: " + health + ")");
    }

    public void gainEXP(int amount){
        exp += amount;
        System.out.println(name + " +" + amount + " EXP kazandı! (Toplam EXP: " + exp + ")");
        if (exp >= 100) {
            exp -= 100;
            levelUp();
        }
    }

    protected void levelUp(){
        level++;
        health += 20;
        System.out.println(name + " LEVEL ATLADI! Yeni level: " + level + " | Yeni HP: " + health);
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("------------------");
    }
}
