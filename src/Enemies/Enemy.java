package Enemies;

public class Enemy {
    private int ID;
    private String name;
    private int health;
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
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
