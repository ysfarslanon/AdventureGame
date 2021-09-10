package Locations.SafeLocations;

import Locations.SafeLocation;
import Source.Player;

public class SafeHouse extends SafeLocation {

    public SafeHouse(Player player) {
        super("Güvenli ev", player);
    }

    @Override
    public boolean onLocation(){
        System.out.println("Güvenli eve geldin. Burada yaralar sarılır ve iyileşirsin.");
        //
        return true;
    }
}
