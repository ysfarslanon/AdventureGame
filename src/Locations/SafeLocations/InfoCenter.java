package Locations.SafeLocations;

import Locations.SafeLocation;
import Source.Player;

public class InfoCenter extends SafeLocation {
    public InfoCenter(Player player) {
        super("Bilgi Merkezi", player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n# Bilgi merkezine hoşgeldin. Oyun hakkında bilgilenmek isteyen meraklı bir oyuncusun.");
        System.out.println("Yapan:Yusuf ARSLAN");
        System.out.println("Geri bildirim için: 14arslan.yusuf@gmail.com veya @ysfarslanon");

        System.out.println("\n# Karakterler");
        System.out.println("1 - Samuray, Sağlık:21, Hasar:5, Para:15");
        System.out.println("2 - Okçu, Sağlık:18, Hasar:7, Para:20");
        System.out.println("3 - Şövalye, Sağlık:24, Hasar:8, Para:5");

        System.out.println("\n# Düşmanlar");
        System.out.println("1 - Zombi, Sağlık:10, Hasar:3, Para:4");
        System.out.println("2 - Vampir, Sağlık:14, Hasar:4, Para:7");
        System.out.println("3 - Ayı, Sağlık:20, Hasar:7, Para:12");
        System.out.println("4 - Yılan, Sağlık:20, Hasar:7, Para:0, Zırh - Silah - Para - Hiçbir şey kazanma ihtimali.");
        System.out.println("\t# Oranlar");
        System.out.println("\tSilah kazanmaoranı: %15 --> Tüfek %20, Kılıç %30, Tabanca %50");
        System.out.println("\tZırh kazanma oranı: %15 --> Ağır %15, Orta %30, Hafif %50");
        System.out.println("\tPara kazanma oranı: %25 --> 10 para %15, 5 para %30, 1 para %50");
        System.out.println("\tHiçbir şey kazanamama oranı: %45");

        System.out.println("\n# Güvenli mekanlar");
        System.out.println("1 - Güvenli ev Can yenilenir.");
        System.out.println("2 - Özelliklerini geliştirebileceğin aletleri bulacağın mekan.");
        System.out.println("3 - Oyun hakkında herşeyi burada bulabileceğin mekan.");

        System.out.println("\n# Savaş mekanları");
        System.out.println("1 - MAĞARA Bu mekanda 1 ile 3 adet ZOMBİ çıkmaktadır. Bu mekanı düşmanlardan arındırırsan YEMEK kazanacaksın.");
        System.out.println("2 - ORMAN Bu mekanda 1 ile 3 adet VAMPİR çıkmaktadır. Bu mekanı düşmanlardan arındırırsan ODUN kazanacaksın.");
        System.out.println("3 - NEHİR Bu mekanda 1 ile 3 adet AYI çıkmaktadır. Bu mekanı düşmanlardan arındırırsan SU kazanacaksın.");
        System.out.println("4 - MADEN Bu mekanda 1 ile 5 adet YILAN çıkmaktadır. Bu mekanda herbir yılandan rastgele ödüller kazanabilirsin ve bu ödüllerle kendini güçlendirebilirsin.");

        System.out.println("\n# Zırhlar");
        System.out.println("1 - Hafif zırh, Engelleme:1, Para:15");
        System.out.println("2 - Orta zırh, Engelleme:3, Para:25");
        System.out.println("3 - Ağır zırh, Engelleme:5, Para:40");

        System.out.println("\n# Silahlar");
        System.out.println("1 - Tabanca, Hasar:+2, Para:25");
        System.out.println("2 - Kılıç, Hasar:+3, Para:35");
        System.out.println("3 - Tüfek, Hasar:+7, Para:45");

        System.out.println("# Yardım");
        System.out.println("\n3 ödülü ölmeden düşmanlardan kazanıp GÜVENLİ EVE geri dönebilirsen bu dünyayı fethedersin ve oyunu bitirirsin.");
        System.out.println("#Mekanlara ait ödülleri kazanmak için mekandaki bütün düşmanları alt etmen gerekiyor.");
        System.out.println("Tabii ki canının az olduğunu düşünüp ölebileceğini tahmin ediyorsan savaştan kaçmak senin elinde.");
        System.out.println("Her mekanda farklı cavarlar vardır ve her girişte farklı sayıda düşmanlar karşılaşabilirsin.");
        System.out.println("Her düşmanla karşılaştığında ilk kimin saldıracağı rastgele belirlenmektedir.");
        System.out.println("Bir düşmandan zayıfsan güçlenmek için DÜKKAN'ı ziyaret edebilirsin.");

        System.out.println("##############################################################################################################################");
        return true;
    }
}
