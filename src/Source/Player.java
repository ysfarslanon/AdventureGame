package Source;

import Characters.Archer;
import Characters.GameCharacter;
import Characters.Knight;
import Characters.Samurai;
import Items.Weapon;

import java.util.Scanner;

public class Player {
    private int ID;
    private String name;
    private int health;
    private int originalHealth;
    private int damage;
    private int money;
    private Inventory inventory;
    private static Scanner input=new Scanner(System.in);


    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
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

    public int getTotalDamage(){return damage+this.getInventory().getWeapon().getDamage();}

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public void initialPlayer(GameCharacter gameCharacter){
       this.setID(gameCharacter.getID());
       this.setHealth(gameCharacter.getHealth());
       this.setDamage(gameCharacter.getDamage());
       this.setMoney(gameCharacter.getMoney());
        System.out.println("Seçtiğin karakter: "+gameCharacter.getName()+" ,Sağlık: "+gameCharacter.getHealth()+
                " Hasar:"+gameCharacter.getDamage()+" Para: "+gameCharacter.getMoney());
    }

    public void printCharacters(){
        GameCharacter[] listCharacters={new Samurai(),new Archer(),new Knight()};
        System.out.println("\n############################# KARAKTERLER #############################");
        for (GameCharacter g:listCharacters ) {
            System.out.println(
                    "ID: "+g.getID()+
                            ",\t İsim: "+g.getName()+
                            ",\t Sağlık: "+g.getHealth()+
                            ",\t Hasar: "+g.getDamage()+
                            ",\t Para: "+g.getMoney()
            );
        }
        System.out.println("######################################################################");
    }

    public void selectCharacter(){
        printCharacters();
        System.out.print("Hangi karakteri seçiyorsun: ");
        int selectedCharacter=input.nextInt();
        while (selectedCharacter<0 || selectedCharacter>3){
            System.out.println("Geçersiz değer girdin. Lütfen tekrar dener misin?");
            selectedCharacter=input.nextInt();
        }

        switch (selectedCharacter){
            case 1:
                initialPlayer(new Samurai());
                break;
            case 2:
                initialPlayer(new Archer());
                break;
            case 3:
                initialPlayer(new Knight());
                break;
        }

    }

    public void printInfoPlayer(){
        System.out.println(
                "Sağlığın: "+this.getHealth()+
                ", Silahın: "+this.getInventory().getWeapon().getName()+
                ", Hasarın: "+this.getTotalDamage()+
                ", Zırhın: "+this.getInventory().getArmor().getName()+
                ", Engelleme: "+this.getInventory().getArmor().getBlock()+
                ", Paran: "+this.getMoney()
        );
    }

}
