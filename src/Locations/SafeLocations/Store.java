package Locations.SafeLocations;

import Locations.Location;
import Locations.NormalLocation;
import Source.Player;

public class Store extends NormalLocation {
    public Store(Player player) {
        super("Mağaza", player);
    }

    @Override
    public boolean onLocation(){
        System.out.println("\nMağazaya hoşgeldin. Burada kendini geliştirebileceğin aletler bulabilirsin.");
        boolean showMenu=true;
        while (showMenu){
            System.out.println("0 - Çıkış \n1 - Silah \n2 - Zırh");
            System.out.print("Seçimin: ");
            int selectCase= Location.input.nextInt();
            while (selectCase<0 || selectCase>2){
                System.out.print("Geçersiz değer girdin. Lütfen tekrar dener misin? ");
                selectCase= Location.input.nextInt();
            }

            switch (selectCase){
                case 0:
                    System.out.println("Tekrar uğraman dileğiyle....");
                    showMenu=false;
                    break;
            }

        }


        return  true;
    }
}
