package Source;

import Items.Armor;
import Items.Weapon;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean isFood;
    private boolean isFirewood;
    private boolean isWater;

    public Inventory() {
        this.weapon = new Weapon(-1,"Yumruk",0,0);
        this.armor = new Armor(-1,"Geleneksel kıyafet",0,0);
        this.isFood=false;// Mağara ödülü
        this.isFirewood=false;// Orman ödülü
        this.isWater=false;// Nehir ödülü
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return isFood;
    }

    public void setFood(boolean food) {
        isFood = food;
    }

    public boolean isFirewood() {
        return isFirewood;
    }

    public void setFirewood(boolean firewood) {
        isFirewood = firewood;
    }

    public boolean isWater() {
        return isWater;
    }

    public void setWater(boolean water) {
        isWater = water;
    }
}
