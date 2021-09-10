package Locations;

import Enemies.Enemy;
import Source.Player;

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

    @Override
    public boolean onLocation() {
        return false;
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
}
