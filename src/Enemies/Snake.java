package Enemies;

import java.util.Random;

public class Snake extends Enemy{
    private Random random=new Random();
    private int damage;
    public Snake() {
        super(4, "Yılan", 12,new Random().nextInt(4)+3, 0);
    }


}
