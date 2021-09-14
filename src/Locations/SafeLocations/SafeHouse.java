package Locations.SafeLocations;

import Locations.SafeLocation;
import Source.Player;

public class SafeHouse extends SafeLocation {

    public SafeHouse(Player player) {
        super("Güvenli ev", player);
    }

    @Override
    public boolean onLocation(){
        if (this.getPlayer().getInventory().isWater()&&this.getPlayer().getInventory().isFirewood() && this.getPlayer().getInventory().isWater()){
            System.out.println("Tebrik ederim bütün düşmanları bölgelerden temizledin ve oyunu kazandın.");
            System.exit(0);
        }else{
            System.out.println("Güvenli eve geldin. Burada yaralar sarılır ve iyileşirsin.");
            this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        }


        return true;
    }
}
