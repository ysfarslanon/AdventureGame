package Locations.BattleLocations;

import Enemies.Enemy;
import Enemies.Vampire;
import Locations.BattleLocation;
import Source.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super("Orman", player, new Vampire(), "Odun", 3);
    }
}
