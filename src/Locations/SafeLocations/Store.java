package Locations.SafeLocations;

import Items.Weapon;
import Locations.Location;
import Locations.NormalLocation;
import Source.Player;

public class Store extends NormalLocation {
    public Store(Player player) {
        super("Mağaza", player);
    }

    @Override
    public boolean onLocation(){
        System.out.println("\nMağazaya hoşgeldin. Burada kendini geliştirebileceğin aletler bulabilirsin.");
        boolean showMenu=true;
        while (showMenu){
            System.out.println("0 - Çıkış \n1 - Silah \n2 - Zırh");
            System.out.print("Seçimin: ");
            int selectCase= Location.input.nextInt();
            while (selectCase<0 || selectCase>2){
                System.out.print("Geçersiz değer girdin. Lütfen tekrar dener misin? ");
                selectCase= Location.input.nextInt();
            }

            switch (selectCase){
                case 0:
                    System.out.println("Tekrar uğraman dileğiyle....");
                    showMenu=false;
                    break;
                case 1:
                    printWeapons();
                    buyWeapon();
                    break;
            }

        }

        return  true;
    }

    public void printWeapons(){
        System.out.println("\n######### SİLAHLAR #########");
        System.out.println("0 - Çıkış");
        for (Weapon w: Weapon.weapons()) {
            System.out.println("ID: "+w.getID()+" - "+w.getName()+", Hasar: "+w.getDamage()+", Fiyat: "+w.getPrice());
        }
        System.out.println("############################");
    }

    public void buyWeapon(){
        System.out.print("Silah seçimi: ");
        int selectedWeaponID=input.nextInt();
        while (selectedWeaponID<0 || selectedWeaponID>Weapon.weapons().length){
            System.out.print("Geçersiz değer girdin. Lütfen tekrar dener misin? ");
            selectedWeaponID= input.nextInt();
        }

        if (selectedWeaponID != 0) {
            Weapon selectedWeapon=Weapon.getWeaponObjectByID(selectedWeaponID);
            if (selectedWeapon != null) {
                if (this.getPlayer().getMoney() >= selectedWeapon.getPrice()) {
                    //Silah satın alma bölümü
                    int balance=this.getPlayer().getMoney()-selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println(selectedWeapon.getName().toUpperCase()+" silahını aldınız.");
                    System.out.println("Kalan paranız: "+this.getPlayer().getMoney()+"\n1");
                }else{
                    System.out.println("\nYetersiz bakiye");
                }//if3
            }//if2
        }//if1


    }//buyWeapon


}
