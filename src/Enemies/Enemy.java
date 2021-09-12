package Enemies;

public class Enemy {
    private int ID;
    private String name;
    private int health;
    private int originalHealth;
    private int damage;

    public Enemy(int ID, String name, int health, int damage) {
        this.ID = ID;
        this.name = name;
        this.health = health;
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
        if (this.getHealth()<=0) this.setHealth(0);
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
}
