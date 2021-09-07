
package Locations;
import Source.Player;

import java.util.Scanner;

public  abstract class Location {
    private String name;
    protected static Scanner input=new Scanner(System.in);
    private Player player;

    public abstract boolean onLocation();

    public Location(String name,Player player) {
        this.name = name;
        this.player=player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public  void selectLocation(){
        while (true){
            this.getPlayer().printInfoPlayer();
        }
    }
}
