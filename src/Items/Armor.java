package Items;

public class Armor {
    private int ID;
    private String name;
    private int block;
    private int price;

    public Armor(int ID, String name, int block, int price) {
        this.ID = ID;
        this.name = name;
        this.block = block;
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

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Armor[] armors(){
        Armor[] armorsList={//Yeni eklenen zırhlar burada oluşturulacaktır.
          new Armor(1,"Hafif",1,15),
          new Armor(2,"Orta",3,25),
          new Armor(3,"Ağır",5,40)

        };
        return  armorsList;
    }

    public static Armor getArmorObjectByID(int id){
        for (Armor a:Armor.armors()) {
            if (a.getID()==id) return a;
        }

        return null;
    }
}
