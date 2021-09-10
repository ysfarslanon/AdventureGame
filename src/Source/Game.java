package Source;

import Locations.BattleLocations.Cave;
import Locations.BattleLocations.Forest;
import Locations.BattleLocations.River;
import Locations.Location;
import Locations.SafeLocations.SafeHouse;
import Locations.SafeLocations.Store;

import java.util.Scanner;

public  class Game {
    private static Scanner input=new Scanner(System.in);
    public static void start(){
        System.out.println("Metin tabanlı macera oyununa hoşgeldin");
        System.out.print("Lütfen sana nasıl hitap edeceğimi söylermisin? : ");
        String nickname= "yusuf";//input.nextLine();
        System.out.println("\nSelam "+nickname+". Hadi devam edelim. Şimdi bir karakter seçmen gerekiyor");
        Player player=new Player(nickname);
        player.selectCharacter();

        Location location=null;
        while(true){

            System.out.println("\n########### Mekanlar ###########");
            System.out.println("0 - Gerçek dünya");
            System.out.println("1 - Güvenli ev (Burada yaralar sarılır ve iyileşirsin.)");
            System.out.println("2 - Mağaza (Burada kendini geliştirebileceğin aletler bulabilirsin.)");
            System.out.println("3 - Mağara (Zombilerin yer aldığını ıssız ve karanlık mekan. ÖDÜL:YEMEK)");
            System.out.println("4 - Orman (Vampirlerin dolaştığını mekan. ÖDÜL:ODUN)");
            System.out.println("5 - Nehir (Ayıların koruduğu kutsal bir mekan. ÖDÜL:SU)");
            System.out.print("Yolculuk nereye: ");
            int selectLocation=input.nextInt();
            switch (selectLocation){
                case 0:
                    location=null;
                    break;
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:
                    location=new Store(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;
                default:
                    System.out.println("Geçersiz değer girdin. Lütfen tekrar dener misin?");
                    break;
            }

            if (location == null) {
                System.out.println("Tekrar görüşmek üzere");
                break;
            }

            if (!location.onLocation()){
                System.out.println("Öldün");
                break;
            }
        }
    }
}
