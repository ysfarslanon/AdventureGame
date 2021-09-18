package Locations.BattleLocations;

import Enemies.Snake;
import Items.Armor;
import Items.Weapon;
import Locations.BattleLocation;
import Source.Player;

import java.util.Random;

public class Mine extends BattleLocation {

    public Mine(Player player) {
        super("Maden", player, new Snake(), 5);
    }

    @Override
    public void defeatEnemy(int enemyNumber) {
        System.out.println(enemyNumber +". düşmanı yendin.");
        int randomItem = getRandom().nextInt(100);
        if (randomItem < 15) {// Win weapons
            randomItem = getRandom().nextInt(100);// Win weapon type
            winWeapon(randomItem);

        }else if (randomItem < 30){ // Win armors
            randomItem = getRandom().nextInt(100);// Win armor type
            winArmor(randomItem);

        }else if(randomItem < 55){// Win money
            randomItem = getRandom().nextInt(100);// Win money count
            winMoney(randomItem);

        }else{
            System.out.println("Malesef hiçbir şey kazanamadın.");
        }

    }

    public void winWeapon(int randomNumber){
        if (randomNumber < 20) {
            System.out.print("Tüfek(+" +Weapon.getWeaponObjectByID(3).getDamage()+" HASAR) kazandın. Silahını değiştirmek istermisin? <E>vet <H>ayır: ");
            if (input.nextLine().toUpperCase().equals("E"))
                changePlayerWeapon(3);

        }else if (randomNumber < 50) {
            System.out.print("Kılıç(+" +Weapon.getWeaponObjectByID(2).getDamage()+" HASAR) kazandın. Silahını değiştirmek istermisin? <E>vet <H>ayır: ");
            if (input.nextLine().toUpperCase().equals("E"))
                changePlayerWeapon(2);

        }else{
            System.out.print("Tabanca(+" +Weapon.getWeaponObjectByID(1).getDamage()+" HASAR)  kazandın. Silahını değiştirmek istermisin?: <E>vet <H>ayır: ");
            if (input.nextLine().toUpperCase().equals("E"))
                changePlayerWeapon(1);

        }

    }

    public void changePlayerWeapon(int weaponID){
        this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjectByID(weaponID));
        System.out.println("Yeni silahın: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Yeni hasar değerin:" + this.getPlayer().getTotalDamage());
    }

    public void winArmor(int randomNumber){
        if (randomNumber < 20) {
            System.out.print("Ağır Zırh(+" + Armor.getArmorObjectByID(3).getBlock() + " ENGELLEME)  kazandın. Zırhını değiştirmek istermisin?: <E>vet <H>ayır: ");
            if(input.nextLine().toUpperCase().equals("E"))
                changePlayerArmor(3);
        }else if (randomNumber < 50) {
            System.out.print("Orta Zırh(+" + Armor.getArmorObjectByID(2).getBlock() + " ENGELLEME)  kazandın. Zırhını değiştirmek istermisin?: <E>vet <H>ayır: ");
            if(input.nextLine().toUpperCase().equals("E"))
                changePlayerArmor(2);
        }else{
            System.out.print("Hafif Zırh(+" + Armor.getArmorObjectByID(1).getBlock() + " ENGELLEME)  kazandın. Zırhını değiştirmek istermisin?: <E>vet <H>ayır: ");
            if(input.nextLine().toUpperCase().equals("E"))
                changePlayerArmor(1);
        }
    }

    public void changePlayerArmor(int armorID){
        this.getPlayer().getInventory().setArmor(Armor.getArmorObjectByID(armorID));
        System.out.println("Yeni zırhın:" + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Yeni engelleme değerin: " + this.getPlayer().getInventory().getArmor().getBlock());
    }

    public void winMoney(int randomNumber){
        if (randomNumber < 20) {
            addPlayerMoney(10);
        }else if (randomNumber <50) {
            addPlayerMoney(5);
        }else{
            addPlayerMoney(1);
        }
    }

    public void addPlayerMoney(int addedMoney){
        this.getPlayer().setMoney(this.getPlayer().getMoney() + addedMoney);
        System.out.println(addedMoney + " para kazandın.");
        System.out.println("Toplam paran: " + this.getPlayer().getMoney());
    }
}
