package Locations.SafeLocations;

import Locations.NormalLocation;
import Source.Player;

public class Store extends NormalLocation {
    public Store(Player player) {
        super("Mağaza", player);
    }

    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya hoşgeldin. Burada kendini geliştirebileceğin aletler bulabilirsin.");
        return  true;
    }
}
