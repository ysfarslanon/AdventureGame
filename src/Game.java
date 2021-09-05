import java.util.Scanner;

public class Game {
    private static Scanner input=new Scanner(System.in);
    public static void start(){
        System.out.println("Metin tabanlı macera oyununa hoşgeldin");
        System.out.print("Lütfen sana nasıl hitap edeceğimi söylermisin? : ");
        String nickname= "yusuf";//input.nextLine();
        System.out.println("\nSelam "+nickname+". Hadi devam edelim. Şimdi bir karakter seçmen gerekiyor");
        Player player=new Player(nickname);
        player.selectCharacter();
    }
}
