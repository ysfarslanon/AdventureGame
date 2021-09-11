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
        return false;
    }

    public boolean combat(){

        return false;
    }

    public void printPlayerStats(){

    }

    public void  printEnemyStats(){

    }

    public void afterHit(){

    }

    public int randomObstacleNumber(){
        Random random=new Random();
        return random.nextInt(this.getMaxEnemy())+1;
    }


}
