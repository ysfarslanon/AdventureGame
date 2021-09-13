package Enemies;

public class Enemy {
    private int ID;
    private String name;
    private int health;
    private int originalHealth;
    private int damage;
    private int money;

    public Enemy(int ID, String name, int health, int damage, int money) {
        this.ID = ID;
        this.name = name;
        this.originalHealth = health;
        this.damage = damage;
        this.money=money;
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
        if (health<=0) health=0;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
