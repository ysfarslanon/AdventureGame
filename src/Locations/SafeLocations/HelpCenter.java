package Locations.SafeLocations;

import Locations.SafeLocation;
import Source.Player;

public class HelpCenter extends SafeLocation {
    public HelpCenter(Player player) {
        super("Yardım merkezi", player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Karakterler");
        System.out.println("1 - Samuray, Sağlık:21, Hasar:5, Para:15");
        System.out.println("2 - Okçu, Sağlık:18, Hasar:7, Para:20");
        System.out.println("3 - Şövalye, Sağlık:24, Hasar:8, Para:5\n");

        System.out.println("Düşmanlar");
        System.out.println("1 - Zombi, Sağlık:10, Hasar:3, Para:4");
        System.out.println("2 - Vampir, Sağlık:14, Hasar:4, Para:7");
        System.out.println("3 - Ayı, Sağlık:20, Hasar:7, Para:12");
        System.out.println("3 - Ayı, Sağlık:20, Hasar:7, Para:0, Zırh - Silah - Para - Hiçbir şey kazanma ihtimali.\n");

        System.out.println("Güvenli mekanlar");
        System.out.println("1 - Güvenli ev Can yenilenir.");
        System.out.println("2 - Özelliklerini geliştirebileceğin aletleri bulacağın mekan.");
        System.out.println("3 - Oyun hakkında herşeyi burada bulabileceğin mekan.\n");

        System.out.println("Savaş mekanları");
        System.out.println("1 - MAĞARA Bu mekanda 1 ile 3 adet ZOMBİ çıkmaktadır. Bu mekanı düşmanlardan arındırırsan YEMEK kazanacaksın.");
        System.out.println("2 - ORMAN Bu mekanda 1 ile 3 adet VAMPİR çıkmaktadır. Bu mekanı düşmanlardan arındırırsan ODUN kazanacaksın.");
        System.out.println("3 - NEHİR Bu mekanda 1 ile 3 adet AYI çıkmaktadır. Bu mekanı düşmanlardan arındırırsan SU kazanacaksın.");
        System.out.println("4 - MADEN Bu mekanda 1 ile 5 adet YILAN çıkmaktadır. Bu mekanda her yılandan Zırh - ");


        return true;
    }
}
