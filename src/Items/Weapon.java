package Items;

public class Weapon {
    private int ID;
    private String name;
    private int damage;
    private int price;

    public Weapon(int ID, String name, int damage, int price) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.price = price;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponsList={//Yeni silahlar buraya eklenecek
            new Weapon(1,"Tabanca",2,25),
            new Weapon(2,"Kılıç",3,35),
            new Weapon(3,"Tüfek",7,45),

        };
        return weaponsList;
    }

    public static Weapon getWeaponObjectByID(int id){
        for (Weapon w:Weapon.weapons()) {
            if (w.getID()==id) return w;
        }
        return null;
    }
}
