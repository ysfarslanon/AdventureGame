package Locations.BattleLocations;

import Enemies.Bear;
import Enemies.Enemy;
import Locations.BattleLocation;
import Source.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super("Nehir", player, new Bear(), "Su", 3);
    }
}
