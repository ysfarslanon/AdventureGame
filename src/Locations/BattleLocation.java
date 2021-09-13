package Locations;

import Enemies.Enemy;
import Source.Player;
import java.util.Random;

public abstract class BattleLocation extends Location{
    private Enemy enemy;
    private String award;
    private int maxEnemy;


    public BattleLocation(String name, Player player,Enemy enemy,String award,int maxEnemy) {
        super(name, player);
        this.enemy=enemy;
        this.award=award;
        this.maxEnemy=maxEnemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxEnemy() {
        return maxEnemy;
    }

    public void setMaxEnemy(int maxEnemy) {
        this.maxEnemy = maxEnemy;
    }

    @Override
    public boolean onLocation() {
        int enemyNumber=this.randomObstacleNumber();
        System.out.println("\n"+this.getName().toUpperCase()+" bölgesindesin.");
        System.out.println("Bu bölgede "+enemyNumber+" tane "+this.getEnemy().getName()+" var. Hepsini öldürmen gerekiyor.");
        System.out.print("<S>avaş veya <K>aç: ");
        String selectCase=input.nextLine().toUpperCase();
        if (selectCase.equals("S") ){
            //System.out.println("SAVAŞ BAŞLIYOR");
            combat(enemyNumber);
            return true;
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("DÜŞMAN SENİ ALT ETTİ.....");
            return false;
        }

        return true;
    }

    public boolean combat(int enemyNumber){
        for (int i = 1; i <=enemyNumber ; i++) {
            this.getEnemy().setHealth(this.getEnemy().getOriginalHealth());
            printPlayerStats();
            printEnemyStats(i);
            while (this.getPlayer().getHealth()>0 && this.getEnemy().getHealth()>0){
                System.out.print("\n<V>ur veya <K>aç: ");
                String selectCombatCase= input.nextLine().toUpperCase();
                if (selectCombatCase.equals("V")) {
                    System.out.println("VURDUN");
                    int enemyHealth=this.getEnemy().getHealth()-this.getPlayer().getTotalDamage();
                    this.getEnemy().setHealth(enemyHealth);
                    afterHit();
                    if (this.getEnemy().getHealth()>0) {
                        System.out.println("\nCANAVAR VURDU");
                        int enemyTotalDamage=this.getEnemy().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(enemyTotalDamage<0) enemyTotalDamage=0;
                        //enemyTotalDamage=enemyTotalDamage < 0 ? 0 : enemyTotalDamage;//Düşmanın toplma hasarı eksi olunca oyuncu hasarı artmaması için
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-enemyTotalDamage);
                        afterHit();
                    }// Düşmanın canı 0 dan büyükse vurabileceği için
                }else{
                    return false;
                }//IF selectCombatCase.equals("V")
            }//WHİLE

            if (this.getEnemy().getHealth()<this.getPlayer().getHealth()){
                System.out.println(i+". düşmanı yendin.");
                System.out.println(this.getEnemy().getMoney()+" para kazandın.");
                int balance=this.getPlayer().getMoney()+this.getEnemy().getMoney();
                this.getPlayer().setMoney(balance);
                System.out.println("Toplam paran: "+this.getPlayer().getMoney());
            }else{
                return false;
            }// IF düşman öldürme


        }//FOR

        return true;
    }

    public void printPlayerStats(){
        System.out.println("\n############## OYUNCU DEĞERLERİ ##############");
        System.out.println("Sağlık: "+this.getPlayer().getHealth());
        //System.out.println("Silah: "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar: "+this.getPlayer().getDamage());
        //System.out.println("Zırh: "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Engelleme: "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para: "+this.getPlayer().getMoney());
    }

    public void  printEnemyStats(int enemyNumber){
        String enemyInfo=enemyNumber+". "+this.getEnemy().getName();
        System.out.println("############## DÜŞMAN DEĞERLERİ ("+enemyInfo+") ##############");
        System.out.println(enemyNumber+". "+this.getEnemy().getName());
        System.out.println("Sağlık: "+this.getEnemy().getHealth());
        System.out.println("Hasar: "+this.getEnemy().getDamage());
        System.out.println("##############################################");
    }

    public void afterHit(){
        System.out.println("Canın: "+this.getPlayer().getHealth());
        System.out.println("Düşman canı: "+this.getEnemy().getHealth());

    }

    public int randomObstacleNumber(){
        Random random=new Random();
        return random.nextInt(this.getMaxEnemy())+1;
    }


}
