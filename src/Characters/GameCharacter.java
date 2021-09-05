package Characters;

public abstract class GameCharacter {
    private int ID;
    private String name;
    private int health;
    private int damage;
    private int money;


    public GameCharacter(int ID, String name, int health, int damage,int money) {
        this.ID = ID;
        this.name = name;
        this.health = health;
        this.money = money;
        this.damage = damage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}
