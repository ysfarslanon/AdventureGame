package Locations;

import Source.Player;

public abstract class BattleLocation extends Location{
    public BattleLocation(String name, Player player) {
        super(name, player);
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
