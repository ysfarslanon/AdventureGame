package Locations;

import Source.Player;

public abstract class NormalLocation extends Location{

    public NormalLocation(String name, Player player) {
        super(name, player);
    }

    @Override
    public boolean onLocation() {
        return true;
        //Safehouse ve ToolStore gibi ölmemesi gereken yerlerde true döndürmelidir.
        //Savaş alanlarında öldüğünde false olacak sekilde ayarlanacak.
    }
}
