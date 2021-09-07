package Locations.SafeLocations;

import Locations.NormalLocation;
import Source.Player;

public class SafeHouse extends NormalLocation {

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
