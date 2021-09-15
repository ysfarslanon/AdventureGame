package Locations;

import Enemies.Enemy;
import Source.Player;
import java.util.Random;

public abstract class BattleLocation extends Location{
    private Enemy enemy;
    private String award;
    private int maxEnemy;
    private static Random random;


    public BattleLocation(String name, Player player,Enemy enemy,String award,int maxEnemy) {
        super(name, player);
        this.enemy=enemy;
        this.award=award;
        this.maxEnemy=maxEnemy;
        random=new Random();
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
        if (selectCase.equals("S") && combat(enemyNumber)){
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
                    randomHit();
                }else{
                    return false;
                }//IF selectCombatCase.equals("V")
            }//WHİLE player ve düşman canlı kaldıkca savaş devam edecektir.

            if (this.getEnemy().getHealth()<this.getPlayer().getHealth()){//Düşman öldürme
                defeatEnemy(i);
            }else{
                return false;
            }

            defeatAllEnemy(i,enemyNumber);

        }//FOR

        return true;
    }

    public void playerHit(){
        System.out.println("VURDUN");
        int enemyHealth=this.getEnemy().getHealth()-this.getPlayer().getTotalDamage();
        this.getEnemy().setHealth(enemyHealth);
        afterHit();
    }

    public void enemyHit(){
        System.out.println("CANAVAR VURDU");
        int enemyTotalDamage=this.getEnemy().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
        enemyTotalDamage= Math.max(enemyTotalDamage, 0);//Düşmanın toplma hasarı eksi olunca oyuncu canı artmaması için
        this.getPlayer().setHealth(this.getPlayer().getHealth()-enemyTotalDamage);
        afterHit();
    }
    public void afterHit(){
        System.out.println("Canın: "+this.getPlayer().getHealth());
        System.out.println("Düşman canı: "+this.getEnemy().getHealth());
        System.out.println();
    }

    public void randomHit(){
        int randomHit= random.nextInt(100);
        //0-50 önce player vuracak sonra enemy vuracak.50-99 önce enemy vuracak sonra player
        if (randomHit<50) {
            playerHit();
            enemyHit();
        }else{
            if (this.getEnemy().getHealth()>0) {// Düşmanın canı 0 dan büyükse vurabileceği için
                enemyHit();
                playerHit();
            }
        }
    }
    public void defeatEnemy(int enemyNumber){
        System.out.println(enemyNumber+". düşmanı yendin.");
        System.out.println(this.getEnemy().getMoney()+" para kazandın.");
        int balance=this.getPlayer().getMoney()+this.getEnemy().getMoney();
        this.getPlayer().setMoney(balance);
        System.out.println("Toplam paran: "+this.getPlayer().getMoney());
    }

    public void defeatAllEnemy(int deadEnemy, int enemyNumber){
        //Bütün düşmanları öldürünce location ödülünü kazanır.
        if (deadEnemy == enemyNumber) {
            System.out.println("\nBütün düşmanları alt ettin ve "+this.getAward().toUpperCase()+" ödülünü kazandın. Artık burası güvenli tekrar gelmene gerek kalmadı. Teşekkürler...");
            if(this.getEnemy().getName().equals("Zombi")) this.getPlayer().getInventory().setFood(true);
            if(this.getEnemy().getName().equals("Vampir")) this.getPlayer().getInventory().setFirewood(true);
            if(this.getEnemy().getName().equals("Ayı")) this.getPlayer().getInventory().setWater(true);
        }
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
        System.out.println("############## DÜŞMAN DEĞERLERİ ##############");
        System.out.println(enemyNumber+". "+this.getEnemy().getName());
        System.out.println("Sağlık: "+this.getEnemy().getHealth());
        System.out.println("Hasar: "+this.getEnemy().getDamage());
        System.out.println("##############################################");
    }

    public int randomObstacleNumber(){
        return random.nextInt(this.getMaxEnemy())+1;
    }




}
