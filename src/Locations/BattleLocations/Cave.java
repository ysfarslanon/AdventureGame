package Locations.BattleLocations;

import Enemies.Enemy;
import Enemies.Zombie;
import Locations.BattleLocation;
import Source.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super("Mağara", player, new Zombie(), "Yemek", 3);
    }
}
